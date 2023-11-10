package innovation.server;

import innovation.route.InnovationRouter;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.main.Main;
import org.apache.camel.spi.PropertiesComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InnovationElasticsearchAPI extends Main {

    private static final Logger logger = LogManager.getLogger(InnovationElasticsearchAPI.class);

    public static void main(String[] args){

        CamelContext camelContext = new DefaultCamelContext();
        InnovationElasticsearchAPI ieAPI = new InnovationElasticsearchAPI();

        PropertiesComponent properties = camelContext.getPropertiesComponent();
        properties.setLocation("classpath:/env.properties");

        try {
            camelContext.addRoutes(new InnovationRouter());
            camelContext.start();
            ieAPI.run();
        } catch (Exception e) {
            logger.error("ieAPI API FAILED: {}",e.getMessage());
        }
    }
}
