package innovation.processors;

import innovation.models.GenericAutocompleteBean;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.io.ByteArrayInputStream;

public class AutocompleteQueryBuilderProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        GenericAutocompleteBean genericAutocompleteBean = (GenericAutocompleteBean) exchange.getIn().getBody();
        String matchQuery = "";

        if(genericAutocompleteBean.getField().contains("term")){
            matchQuery =
                    "{\n" +
                            "    \"suggest\":{\n" +
                            "    \"term-suggester\":{\n" +
                            "      \"text\": \"" + genericAutocompleteBean.getAutocomplete() + "\",\n" +
                            "      \"term\":{\n" +
                            "        \"field\":\"" + genericAutocompleteBean.getField() + "\",\n" +
                            "        \"suggest_mode\":\"always\"\n" +
                            "      }\n" +
                            "    }\n" +
                            "  }\n" +
                            "}";
        }

        else if(genericAutocompleteBean.getField().contains("completion")){
            matchQuery =
                    "{\n" +
                            "    \"suggest\": {\n" +
                            "        \"completion\" : {\n" +
                            "            \"prefix\" : \"" + genericAutocompleteBean.getAutocomplete() + "\",\n" +
                            "            \"completion\" : {\n" +
                            "                \"field\" : \"" + genericAutocompleteBean.getField() + ".completion\"\n" +
                            "            }\n" +
                            "        }\n" +
                            "    }\n" +
                            "}";
        }

        else if(genericAutocompleteBean.getField().contains("phrase")){
            matchQuery = "{\n" +
                    "  \"suggest\": {\n" +
                    "    \"text\": \"" + genericAutocompleteBean.getAutocomplete() + "\",\n" +
                    "    \"term-suggester\": {\n" +
                    "      \"phrase\": {\n" +
                    "        \"field\": \"" + genericAutocompleteBean.getField() + ".trigram\",\n" +
                    "        \"size\": 5,\n" +
                    "        \"gram_size\": 2,\n" +
                    "        \"direct_generator\": [ {\n" +
                    "          \"field\": \""  + genericAutocompleteBean.getField() + ".trigram\",\n" +
                    "          \"suggest_mode\": \"always\"\n" +
                    "        } ]\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        }
        else if(genericAutocompleteBean.getField().contains("ngram")){
            matchQuery = "{\n" +
                    "  \"query\": {\n" +
                    "    \"match\": {\n" +
                    "      \"" + genericAutocompleteBean.getField() + "\": \"" + genericAutocompleteBean.getAutocomplete() + "\"\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";
        }
        else {
            throw new Exception("Bad request");
        }

        exchange.getIn().setBody(new ByteArrayInputStream((matchQuery).getBytes()));
        exchange.setProperty("Alias",  genericAutocompleteBean.getAlias());
        exchange.setProperty("Suggester",  genericAutocompleteBean.getField());
    }
}
