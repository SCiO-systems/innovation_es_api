package innovation.route;

import innovation.models.GenericAutocompleteBean;
import innovation.models.GenericSearchByElement;
import innovation.models.GenericSearchById;
import innovation.models.RTBOrderedSearchRequest;
import innovation.processors.*;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.model.rest.RestBindingMode;

import java.io.ByteArrayInputStream;

public class InnovationRouter extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        restConfiguration()
                .component("jetty")
                .host("{{HOST}}")
                .port("{{PORT}}")
                .clientRequestValidation(true)
                .skipBindingOnErrorCode(false)     // Add this line of code for returning response bodies when http status code != 200
                .bindingMode(RestBindingMode.json);


        rest("/api/v2/")
                .post("autocomplete")
                .type(GenericAutocompleteBean.class)
                .to("direct:suggester");


        from("direct:suggester")
//                .removeHeaders("CamelHttp*")
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .process(new AutocompleteQueryBuilderProcessor())
                .enrich().simple("{{ELASTICSEARCH}}" + "/" + "${exchangeProperty.Alias}" + "/_search" + "?bridgeEndpoint=true")
                .process(new SuggesterResponseProcessor())
                .unmarshal().json(JsonLibrary.Jackson);

        from("direct:retrieveDocsById")
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))

                .process(exchange -> {
                    String matchQuery = "";
                    GenericSearchById genericSearchById = (GenericSearchById) exchange.getIn().getBody();

                    switch (genericSearchById.getAlias()) {
                        case "rtb_innovations":
                            matchQuery =
                                    "{" +
                                            "  \"query\": {" +
                                            "    \"match\": {" +
                                            "      \"innovation_uuid.keyword\": \"" + genericSearchById.getId() + "\"" +
                                            "    }" +
                                            "  }" +
                                            "}";

                            break;
                    }

                    exchange.setProperty("Alias", genericSearchById.getAlias());
                    exchange.getIn().setBody(new ByteArrayInputStream((matchQuery).getBytes()));

                })
                .enrich().simple("{{ELASTICSEARCH}}" + "/" + "${exchangeProperty.Alias}" + "/_search" + "?bridgeEndpoint=true")
                .process(new GenericModelMappingProcessor());

        from("direct:retrieveDocsByTitle")
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))

                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        GenericSearchByElement genericSearchById = (GenericSearchByElement) exchange.getIn().getBody();


                        String matchQuery =
                                "{" +
                                        "  \"query\": {" +
                                        "    \"match\": {" +
                                        "      \"innovation_common_name.keyword\": \"" + genericSearchById.getTitle() + "\"" +
                                        "    }" +
                                        "  }" +
                                        "}";

                        exchange.getIn().setBody(new ByteArrayInputStream((matchQuery).getBytes()));
                        exchange.setProperty("Alias", genericSearchById.getAlias());

                    }
                })
                .enrich().simple("{{ELASTICSEARCH}}" + "/" + "${exchangeProperty.Alias}" + "/_search" + "?bridgeEndpoint=true")
                .process(new GenericModelMappingProcessor());

        from("direct:RTBInnovationsOrderedSearch")
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        exchange.setProperty("Voc", "RTB");
                    }
                })
                .process(new RTBPaginationQueryProcessor())
                .enrich().simple("{{ELASTICSEARCH}}" + "/rtb_innovations/_search?bridgeEndpoint=true")
                .process(new RTBInnovationsMatchingQueryProcessor());

    }
}
