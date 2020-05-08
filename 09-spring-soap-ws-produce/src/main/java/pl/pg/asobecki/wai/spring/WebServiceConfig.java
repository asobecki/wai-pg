package pl.pg.asobecki.wai.spring;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * Created by asobecki on 30.03.17.
 */
@EnableWs   // wybór rodzaju serwletu do obsługi wiadomości SOAP (Spring WS MessageDispatcherServlet)
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {


    // wskazanie serwletowi kontekstu aplikacji, zeby Spring WS mógł automatycznie wykryć beany Spring'a
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);    // transformacja adresów usługi w zależności od sposobu wywołania (127.0.0.1/192.168.0.1)
        return new ServletRegistrationBean(servlet, "/ws/*");   // mapowanie url na servlet
    }


    // wystawia interfejs usługi w standardzie WSDL 1.1 uzywając zdefiniowanej schemy (regionsSchema)
    @Bean(name = "regions")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema regionsSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("RegionsPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
        wsdl11Definition.setSchema(regionsSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema regionsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("regions.xsd"));
    }
}
