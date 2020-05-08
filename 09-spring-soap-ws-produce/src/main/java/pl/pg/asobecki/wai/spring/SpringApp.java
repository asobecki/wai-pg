package pl.pg.asobecki.wai.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @Configuration - this class is a source of bean definitions
// @EnableAutoConfiguration - start adding beans based on classpath settings
// @EnableWebMvc - enable spring mvc -> its activate DispatcherServlet
// @ComponentScan - spring must look for other components, configuration and services annotations in pl.pg.asobecki.wai.spring package

@SpringBootApplication
public class SpringApp {
    // test: curl --header "content-type: text/xml" -d @testing-request.xml http://localhost:8080/ws
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }
}
