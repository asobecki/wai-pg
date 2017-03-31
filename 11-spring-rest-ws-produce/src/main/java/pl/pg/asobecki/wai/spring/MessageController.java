package pl.pg.asobecki.wai.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by asobecki on 31.03.17.
 */
// dont use view technology
@RestController // value return by the action will be placed in body of response
public class MessageController {
    private static final String defaultMsg = "Hi %s! This is REST Web Service example.";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/welcome")
    public Message sendMessage(@RequestParam(value="recipient", defaultValue = "Jan Kowalski") String recipient) {
        return new Message(counter.incrementAndGet(), recipient,String.format(defaultMsg, recipient));
    }
}
