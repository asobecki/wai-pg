package pl.pg.asobecki.wai.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringApp.class);
    }

    public static void main(String[] args) throws Exception {
    	SpringApplication.run(ServletInitializer.class, args);
    }
}
