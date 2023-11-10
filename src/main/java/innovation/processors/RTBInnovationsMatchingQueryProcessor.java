package innovation.processors;

import com.google.gson.Gson;
import innovation.models.*;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class RTBInnovationsMatchingQueryProcessor implements Processor {
    private List<AggregationModel> createAggregationField(Exchange exchange, JSONObject aggregations){
        List<AggregationModel> aggregationModels = new ArrayList<>();

        //Cgiar action areas
        JSONArray cgiarActionAreas = aggregations.getJSONObject("cgiar_action_areas").getJSONArray("buckets");
        AggregationModel aggregationModel = new AggregationModel();
        aggregationModel.setKey("cgiar_action_areas");
        List<ValueDocCountModel> valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < cgiarActionAreas.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) cgiarActionAreas.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);


        //region
        JSONArray region = aggregations.getJSONObject("region").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("region");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < region.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) region.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);

        JSONArray submitterCompanyName = aggregations.getJSONObject("submitter_company_name").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("submitter_company_name");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < submitterCompanyName.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) submitterCompanyName.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);


        //env_benefits
        JSONArray envBenefits = aggregations.getJSONObject("env_benefits").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("env_benefits");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < envBenefits.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) envBenefits.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);

        //type_of_innovation
        JSONArray type_of_innovation = aggregations.getJSONObject("type_of_innovation").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("type_of_innovation");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < type_of_innovation.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) type_of_innovation.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);

        //business_category
        JSONArray business_category = aggregations.getJSONObject("business_category").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("business_category");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < business_category.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) business_category.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);

        //business_category
        JSONArray technical_fields = aggregations.getJSONObject("technical_fields").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("technical_fields");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < technical_fields.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) technical_fields.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);

        //gov_type
        JSONArray gov_type = aggregations.getJSONObject("gov_type").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("gov_type");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < gov_type.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) gov_type.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);

        //impact_areas
        JSONArray impact_areas = aggregations.getJSONObject("impact_areas").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("impact_areas");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < impact_areas.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) impact_areas.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);

        //impact_areas
        JSONArray countries = aggregations.getJSONObject("countries").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("countries");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < countries.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) countries.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);

        //keywords
        JSONArray keywords = aggregations.getJSONObject("keywords").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("keywords");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < keywords.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) keywords.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);


        //sdgs
        //keywords
        JSONArray sdgs = aggregations.getJSONObject("sdgs").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("sdgs");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < sdgs.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) sdgs.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);

        //type_of_innovation
        JSONArray sdg_targets = aggregations.getJSONObject("sdg_targets").getJSONArray("buckets");
        aggregationModel = new AggregationModel();
        aggregationModel.setKey("sdg_targets");
        valueDocCountModels = new ArrayList<>();

        for(int j = 0; j < sdg_targets.length(); j++){
            ValueDocCountModel valueDocCountModel = new ValueDocCountModel();
            JSONObject keyDocCount = (JSONObject) sdg_targets.get(j);

            valueDocCountModel.setValue(keyDocCount.get("key").toString());
            valueDocCountModel.setDoc_count(keyDocCount.getInt("doc_count"));

            valueDocCountModels.add(valueDocCountModel);
        }
        aggregationModel.setValue_doc_count(valueDocCountModels);
        aggregationModels.add(aggregationModel);



        return aggregationModels;
    }
    @Override
    public void process(Exchange exchange) throws Exception {

        BaseResponse baseResponse = new BaseResponse();
        FilteredInnovationsResponse response = new FilteredInnovationsResponse();


        List<InnovationMainRootUpdated> innovationMainRoots = new ArrayList<>();

        String res = exchange.getIn().getBody(String.class);
        JSONObject jsonObject = new JSONObject(res);
        JSONObject source;

        JSONObject totalObject = jsonObject.getJSONObject("hits").getJSONObject("total");
        JSONArray jsonArray = jsonObject.getJSONObject("hits")
                .getJSONArray("hits");

        try {
            JSONObject aggregations = jsonObject.getJSONObject("aggregations");
            response.setAggregations(createAggregationField(exchange, aggregations));

        }
        catch (Exception e){
            response.setAggregations(new ArrayList<>());

        }

        exchange.setProperty("End", true);

        if(jsonArray.length() == 0)
            exchange.setProperty("End", false);

//        Add this if u want to use scroll api with the relevant route RestWithScrollApiRoute (uncomment few lines down, too)
//        String scrollID = (String) jsonObject.get("_scroll_id");

        try {
            source = ((JSONObject)jsonArray.get(0)).getJSONObject("_source");
        }
        catch (Exception e){
            baseResponse.setResponse(e.toString());
            baseResponse.setCode("404");
            exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE,404);
        }


        for(int i = 0; i < jsonArray.length(); i++){
            source = ((JSONObject)jsonArray.get(i)).getJSONObject("_source");

            InnovationMainRootUpdated innovationMainRoot = new Gson().fromJson(String.valueOf(source), InnovationMainRootUpdated.class);
            innovationMainRoots.add(innovationMainRoot);
        }

        response.setDocuments(innovationMainRoots);
        response.setTotal((Integer) totalObject.get("value"));

        baseResponse.setCode("200");
        baseResponse.setResponse(response);
        exchange.getIn().setBody(baseResponse);
    }
}
