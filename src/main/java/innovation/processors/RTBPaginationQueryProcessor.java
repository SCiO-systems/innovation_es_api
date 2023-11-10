package innovation.processors;

import innovation.models.KeyValueModel;
import innovation.models.RTBOrderedSearchRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.ArrayList;
import java.util.List;

public class RTBPaginationQueryProcessor implements Processor {
    private String fieldMapping(String inputField) {
        String field = "";

        if (inputField.equals("title")){
            field = "innovation_common_name";

        }
        else if(inputField.equals("last_updated")){
            field = "work_end_date";

        }
        else if (inputField.equals("cgiar_action_areas")){
            field = "CGIAR_action_areas_name";

        }
        else if(inputField.equals("region")){
            field = "region";

        }
        else if(inputField.equals("submitter_company_name")){
            field = "submitter_company_name";

        }
        else if(inputField.equals("env_benefits")){
            field = "environmental_benefits";

        }
        else if(inputField.equals("type_of_innovation")){
            field = "innovation_type_new";

        }
        else if(inputField.equals("business_category")){
            field = "business_category";

        }
        else if(inputField.equals("technical_fields")){
            field = "technical_fields";

        }
        else if(inputField.equals("gov_type")){
            field = "gov_type_of_solution";

        }
        else if(inputField.equals("impact_areas")){
            field = "impact_areas";

        }
        else if(inputField.equals("countries")){
            field = "locations_of_implementation";

        }
        else if(inputField.equals("keywords")){
            field = "related_keywords";

        }
        else if(inputField.equals("sdg_targets")){
            field = "sdg_targets";

        }
        else if(inputField.equals("sdgs")){
            field = "SDG.fullName";

        }
        return field;

    }

    private String createTermField  (String key, String value) {
        String termField = "";

        termField =
                "{\n" +
                        "  \"term\": {\n" +
                        "       \"" + key + ".keyword\": {\n" +
                        "           \"value\": \"" + value + "\"\n" +
                        "         }\n" +
                        "   }\n" +
                        "}";

        return termField;
    }

    private String createBoolQuery(List<KeyValueModel> keyValueModels) {
        String boolQuery = ",";
        String field = "";

        if (keyValueModels.size() == 0)
            return "";
        else {
            List<String> keyList = new ArrayList<>();

//            Initialize list of available keys,
//            Each key will be a different should statement
            for (KeyValueModel keyValueModel : keyValueModels) {
                if (!keyList.contains(keyValueModel.getKey()))
                    keyList.add(keyValueModel.getKey());
            }


            for (String key : keyList) {
                String shouldQuery = "{\"bool\":{ \"should\": [ ";

                for (int i = 0; i < keyValueModels.size(); i++) {
                    if (key.equals(keyValueModels.get(i).getKey())) {
                        field = fieldMapping(keyValueModels.get(i).getKey());

                        shouldQuery = shouldQuery + createTermField(field, keyValueModels.get(i).getValue()) + ",";
                    }

                }
//                Remove last ","
                shouldQuery = shouldQuery.substring(0, shouldQuery.length() - 1) + "]}},";
                boolQuery = boolQuery + shouldQuery;
            }

//             Remove last ","
            boolQuery = boolQuery.substring(0, boolQuery.length() - 1);

        }

        return boolQuery;
    }


    private String specificAggregationQuery(){
        String aggQuery = ", \n" +
                "  \"aggs\": {\n" +
                "      \"cgiar_action_areas\": {\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"CGIAR_action_areas_name.keyword\",\n" +
                "          \"size\": 100\n" +
                "        }\n" +
                "      },\n" +
                "      \"region\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"region.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      }\n" +
                "      ,\n" +
                "      \"submitter_company_name\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"submitter_company_name.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      }\n" +
                "      ,\n" +
                "      \"env_benefits\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"environmental_benefits.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      }\n" +
                "      ,\n" +
                "      \"type_of_innovation\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"innovation_type_new.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      },\n" +
                "      \"business_category\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"business_category.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      }\n" +
                "      ,\n" +
                "      \"technical_fields\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"technical_fields.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      }\n" +
                "       ,\n" +
                "      \"gov_type\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"gov_type_of_solution.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      },\n" +
                "      \"impact_areas\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"impact_areas.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      }\n" +
                "      ,\n" +
                "      \"countries\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"locations_of_implementation.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      } ,\n"  +
                "      \"sdgs\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"SDG.fullName.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      } ,\n" +
                "      \"keywords\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"related_keywords.keyword\",\n" +
                "           \"size\": 2000\n" +
                "        }\n" +
                "      },\n" +
                "      \"sdg_targets\":{\n" +
                "        \"terms\": {\n" +
                "          \"field\": \"SDG_targets.keyword\",\n" +
                "           \"size\": 100\n" +
                "        }\n" +
                "      }\n" +
                "    }";

        return aggQuery;

    }


    private String createQueryByField(String requestedField, Exchange exchange){
        String mappedField = "";


        if (requestedField.equals("title")){
            mappedField = "innovation_common_name.keyword";

        }
        else if(requestedField.equals("last_updated")){
            mappedField = "work_end_date";

        }
        return mappedField;

    }

    private String createTermList(List<KeyValueModel> keyValueModels){
        String termQuery = "";
        String field = "";


        for(int i = 0; i < keyValueModels.size(); i++){
            if (keyValueModels.get(i).getKey().equals("title")){
                field = "innovation_common_name.keyword";

            }
            else if(keyValueModels.get(i).getKey().equals("last_updated")){
                field = "work_end_date";

            }
            else if (keyValueModels.get(i).getKey().equals("cgiar_action_areas")){
                field = "CGIAR_action_areas_name";

            }
            else if(keyValueModels.get(i).getKey().equals("region")){
                field = "region";

            }
            else if(keyValueModels.get(i).getKey().equals("submitter_company_name")){
                field = "submitter_company_name";

            }
            else if(keyValueModels.get(i).getKey().equals("env_benefits")){
                field = "environmental_benefits";

            }
            else if(keyValueModels.get(i).getKey().equals("type_of_innovation")){
                field = "innovation_type_new";

            }
            else if(keyValueModels.get(i).getKey().equals("business_category")){
                field = "business_category";

            }
            else if(keyValueModels.get(i).getKey().equals("technical_fields")){
                field = "technical_fields";

            }
            else if(keyValueModels.get(i).getKey().equals("gov_type")){
                field = "gov_type_of_solution";

            }
            else if(keyValueModels.get(i).getKey().equals("impact_areas")){
                field = "impact_areas";

            }
            else if(keyValueModels.get(i).getKey().equals("countries")){
                field = "locations_of_implementation";

            }
            else if(keyValueModels.get(i).getKey().equals("keywords")){
                field = "related_keywords";

            }
            else if(keyValueModels.get(i).getKey().equals("sdg_targets")){
                field = "sdg_targets";

            }
            else if(keyValueModels.get(i).getKey().equals("sdgs")){
                field = "SDG.fullName";

            }


            termQuery =  termQuery +
                    " {\n" +
                    "                \"term\": {\n" +
                    "                    \"" + field + ".keyword\": \"" + keyValueModels.get(i).getValue() + "\"\n" +
                    "                }\n" +
                    "            }";

            if(i + 1 != keyValueModels.size())
                termQuery = termQuery + ",";
        }

        return termQuery;
    }


    private String createMatchList(List<KeyValueModel> keyValueModels){
        String matchQuery = "";
        String field = "";


        for(int i = 0; i < keyValueModels.size(); i++){
            if (keyValueModels.get(i).getKey().equals("title")){
                field = "innovation_common_name.keyword";

            }
            else if(keyValueModels.get(i).getKey().equals("last_updated")){
                field = "work_end_date";

            }
            if (keyValueModels.get(i).getKey().equals("cgiar_action_areas")){
                field = "CGIAR_action_areas_name";

            }
            else if(keyValueModels.get(i).getKey().equals("region")){
                field = "region";

            }
            else if(keyValueModels.get(i).getKey().equals("submitter_company_name")){
                field = "submitter_company_name";

            }
            else if(keyValueModels.get(i).getKey().equals("env_benefits")){
                field = "environmental_benefits";

            }
            else if(keyValueModels.get(i).getKey().equals("type_of_innovation")){
                field = "innovation_type_new";

            }
            else if(keyValueModels.get(i).getKey().equals("business_category")){
                field = "business_category";

            }
            else if(keyValueModels.get(i).getKey().equals("technical_fields")){
                field = "technical_fields";

            }
            else if(keyValueModels.get(i).getKey().equals("gov_type")){
                field = "gov_type_of_solution";

            }
            else if(keyValueModels.get(i).getKey().equals("impact_areas")){
                field = "impact_areas";

            }
            else if(keyValueModels.get(i).getKey().equals("countries")){
                field = "locations_of_implementation";

            }
            else if(keyValueModels.get(i).getKey().equals("keywords")){
                field = "related_keywords";

            }
            else if(keyValueModels.get(i).getKey().equals("sdg_targets")){
                field = "sdg_targets";

            }




            matchQuery =  matchQuery + "{ \"match_phrase\": { \"" + field  + "\": \"" + keyValueModels.get(i).getValue() + "\"}}";
//            matchQuery =  matchQuery + "{ \"match\": { \"" + keyValueModels.get(i).getKey() + ".keyword" + "\": \"" + keyValueModels.get(i).getValue() + "\"}}";

            if(i + 1 != keyValueModels.size())
                matchQuery = matchQuery + ",";
        }

        return matchQuery;
    }

    @Override
    public void process(Exchange exchange) throws Exception {

        RTBOrderedSearchRequest request = exchange.getIn().getBody(RTBOrderedSearchRequest.class);

//        Create query based on requested action: SEARCH OR ORDERED_SEARCH

        String aggs = "";
        if(exchange.getProperty("Voc").equals("RTB")){
            aggs = specificAggregationQuery();
        }

        String searchQuery = "";
        String filters = "";

        if(request.getOperation().getDetails().getFilter().size() != 0) {
            filters = createBoolQuery(request.getOperation().getDetails().getFilter());
        }
        if(request.getOperation().getAction().equals("search")){

            searchQuery =
                    "{" +
                            "\"from\": " + request.getOperation().getDetails().getFrom() + ", " +
                            " \"size\": "+ request.getOperation().getDetails().getSize() + ", " +
                            "   \"query\":{" +
                            "      \"bool\":{" +
                            "         \"must\":[" +
                            "            {" +
                            "               \"multi_match\":{" +
                            "                  \"query\":\"" + request.getKeyword()  + "\"," +
                            "                  \"type\":\"phrase\"" +

                            "               }" +
                            "            }" +
                            filters +
                            "         ]"+
                            "        }" +
                            "    }" +
//                                createAggregatorsField(innovationRequest.getDetails().getFilter()) +
                            aggs +
                            "}";
        }
        else if(request.getOperation().getAction().equals("ordered_search")){
            searchQuery =  "{" +
                    "\"from\": " + request.getOperation().getDetails().getFrom() + ", " +
                    " \"size\": "+ request.getOperation().getDetails().getSize() + ", " +
                    "   \"query\":{" +
                    "      \"bool\":{" +
                    "         \"must\":[" +
                    "            {" +
                    "               \"multi_match\":{" +
                    "                  \"query\":\"" + request.getKeyword()  + "\"," +
                    "                  \"type\":\"phrase\"" +
                    "               }" +
                    "            }" +
                    filters +
                    "         ]"+
                    "        }" +
                    "    }," +
                    "  \"sort\": [" +
                    "    {" +
                    "      \"" + createQueryByField(request.getOperation().getDetails().getOrder().getField(), exchange) + "\": {" +
                    "        \"order\": \"" + request.getOperation().getDetails().getOrder().getSort() + "\"" +
                    "      }" +
                    "    }" +
                    "  ]"+
                    aggs +
                    "}";
        }

        exchange.getIn().setBody(searchQuery);
    }
}
