package innovation.processors;

import com.google.gson.Gson;
import innovation.models.*;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.HashMap;
import java.util.List;

public class SuggesterResponseProcessor implements Processor {


    private GenericResponse createCompletionSuggester(JSONObject jsonObject, Exchange exchange){
        GenericResponse genericResponse = new GenericResponse();
        SuggestionsResponse suggestionsResponse = new SuggestionsResponse();

        List<Object> objectList = new ArrayList<>();

        JSONArray suggestionsArray = jsonObject.getJSONObject("suggest")
                .getJSONArray("completion")
                .getJSONObject(0)
                .getJSONArray("options");
        JSONObject jsonObj;

        try {
//            Keep this line of code for getting the right exception (unorthodox or what?)
            jsonObj = suggestionsArray.getJSONObject(0).getJSONObject("_source");
        }
        catch (Exception e) {
            genericResponse.setResponse(e.toString());
            genericResponse.setCode("404");
            exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE, 404);

            return genericResponse;
        }

        for (int i = 0; i < suggestionsArray.length(); i++) {
            jsonObj = suggestionsArray.getJSONObject(i).getJSONObject("_source");

            if (exchange.getProperty("Alias").toString().contains("rtb_innovations")) {
                InnovationMainRootUpdated innovationMainRoot = new Gson().fromJson(String.valueOf(jsonObj), InnovationMainRootUpdated.class);
                objectList.add(innovationMainRoot);
            }


            if (exchange.getProperty("Alias").toString().contains("clarisa_institutions_ontology")) {
                HashMap<String, Object> objHashMap = new Gson().fromJson(jsonObj.toString(), HashMap.class);
                objectList.add(objHashMap);
            }

        }

        suggestionsResponse.setSuggestions(objectList);
        genericResponse.setResponse(suggestionsResponse);
        genericResponse.setCode("200");

        return genericResponse;

    }

    private GenericResponse createPhraseTermSuggester(JSONObject jsonObject){
        GenericResponse genericResponse = new GenericResponse();

        JSONArray termSuggester = jsonObject.getJSONObject("suggest").getJSONArray("term-suggester");
        List<SuggesterBean> suggesterBeans = new ArrayList<>();
        GenericSuggesterBeanResponse genericSuggestionsResponse = new GenericSuggesterBeanResponse();

        for (int i = 0; i < termSuggester.length(); i++) {
            SuggesterBean suggesterBean = new SuggesterBean();
            List<Options> optionsList = new ArrayList<>();

            JSONObject suggestObj = (JSONObject) termSuggester.get(i);
            suggesterBean.setText(suggestObj.get("text").toString());

            for (int j = 0; j < suggestObj.getJSONArray("options").length(); j++) {
                Options options = new Options();

                options.setText(((JSONObject) suggestObj.getJSONArray("options").get(j)).get("text").toString());
                options.setScore(((JSONObject) suggestObj.getJSONArray("options").get(j)).get("score").toString());
                optionsList.add(options);
            }
            suggesterBean.setOptions(optionsList);
            suggesterBeans.add(suggesterBean);

        }

        genericResponse.setCode("200");
        genericSuggestionsResponse.setSuggestions(suggesterBeans);
        genericResponse.setResponse(genericSuggestionsResponse);
        return genericResponse;
    }


    private GenericResponse createNgramTokenizer(JSONObject jsonObject, Exchange exchange){
        GenericResponse genericResponse = new GenericResponse();
        List<Object> objectList = new ArrayList<>();

        int taxonIdPos;
        String taxonId;
        JSONObject jsonObj;

        JSONArray hitsArray = jsonObject.getJSONObject("hits")
                .getJSONArray("hits");
        JSONObject totalObject = jsonObject.getJSONObject("hits").getJSONObject("total");

        try {
//            Keep this line of code for getting the right exception (unorthodox or what?)
            jsonObj = hitsArray.getJSONObject(0).getJSONObject("_source");
        }
        catch (Exception e){
            genericResponse.setResponse(e.toString());
            genericResponse.setCode("404");

            return genericResponse;
        }

        GenericSuggestionsResponse suggestionsResponse = new GenericSuggestionsResponse();


        if(exchange.getProperty("Alias").toString().contains("rtb_innovations")){

            for(int i = 0; i < hitsArray.length();i++) {
                jsonObj = hitsArray.getJSONObject(i).getJSONObject("_source");
                InnovationMainRootUpdated innovationMainRoot = new Gson().fromJson(String.valueOf(jsonObj), InnovationMainRootUpdated.class);

                objectList.add(innovationMainRoot);
            }
            suggestionsResponse.setSuggestions(objectList);
            genericResponse.setResponse(suggestionsResponse);

        }

        suggestionsResponse.setTotal((Integer) totalObject.get("value"));
        genericResponse.setCode("200");

        return genericResponse;

    }


    @Override
    public void process(Exchange exchange) throws Exception {
        GenericResponse genericResponse = new GenericResponse();

        String body = exchange.getIn().getBody(String.class);
        JSONObject jsonObject = new JSONObject(body);


        //        Code for completion suggester
        if(exchange.getProperty("Suggester").toString().contains("completion"))
            genericResponse = createCompletionSuggester(jsonObject, exchange);


        if(exchange.getProperty("Suggester").toString().contains("term") ||
                exchange.getProperty("Suggester").toString().contains("phrase"))
            genericResponse = createPhraseTermSuggester(jsonObject);

        if(exchange.getProperty("Suggester").toString().contains("ngram"))
            genericResponse = createNgramTokenizer(jsonObject, exchange);



        exchange.getIn().setBody(new Gson().toJson(genericResponse));
    }
}
