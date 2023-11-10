package innovation.processors;

import com.google.gson.Gson;
import innovation.models.BaseResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;

public class GenericModelMappingProcessor implements Processor {


    @Override
    public void process(Exchange exchange) throws Exception {
        String body = exchange.getIn().getBody(String.class);
        BaseResponse baseResponse = new BaseResponse();


        JSONObject jsonObject = new JSONObject(body);
        try {
            JSONArray jsonArray = jsonObject.getJSONObject("hits").getJSONArray("hits");

            JSONObject jsonObj = jsonArray.getJSONObject(0).getJSONObject("_source");

            baseResponse.setCode("200");
            baseResponse.setResponse(new Gson().fromJson(String.valueOf(jsonObj), Object.class));
            exchange.getIn().setBody(baseResponse);
        }
        catch (Exception e){
            baseResponse.setResponse(e.toString());
            baseResponse.setCode("404");
            exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE,404);
            exchange.getIn().setBody(baseResponse);
        }
    }
}
