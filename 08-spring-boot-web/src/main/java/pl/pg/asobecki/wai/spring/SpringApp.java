package pl.pg.asobecki.wai.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringApp.class, args);
    }

}
