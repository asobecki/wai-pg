package pl.pg.asobecki.wai.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class SpringApp {
    private static final Logger log = LoggerFactory.getLogger(SpringApp.class);

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Message message = restTemplate.getForObject("http://127.0.0.1:8080/welcome?recipient=Beckham", Message.class);
        log.info(message.toString());
    }
}
