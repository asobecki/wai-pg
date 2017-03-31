package pl.pg.asobecki.wai.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by asobecki on 30.03.17.
 */
// how to serialize and deserialize XML request
// using Jaxb2Marshaller
@Configuration
public class RegionsConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // marshaller.setContextPath("regions.wsdl");  // defined in pom.xml in plugins section
        marshaller.setContextPath("io.spring.guides.gs_producing_web_service");
        return marshaller;
    }

    @Bean
    public RegionsClient regionsClient(Jaxb2Marshaller marshaller) {
        RegionsClient client = new RegionsClient();
        client.setDefaultUri("http://127.0.0.1:8080/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
