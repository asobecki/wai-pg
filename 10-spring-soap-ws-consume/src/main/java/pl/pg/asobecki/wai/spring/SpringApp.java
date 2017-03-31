package pl.pg.asobecki.wai.spring;

import io.spring.guides.gs_producing_web_service.GetRegionResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(RegionsConfiguration.class);
        ctx.refresh();
        RegionsClient regionsClient = ctx.getBean(RegionsClient.class);
        GetRegionResponse response = regionsClient.getRegion("Pomorskie");
        System.out.println(response.getRegion());
    }

    /*@Bean
    CommandLineRunner callRegionWS(RegionsClient regionsClient) {
        return args -> {
            String region = "Pomorskie";
            if(args.length >0) {
                region = args[0];
            }

            GetRegionResponse response = regionsClient.getRegion(region);
            System.err.println(response.getRegion());
        };
    }*/
}
