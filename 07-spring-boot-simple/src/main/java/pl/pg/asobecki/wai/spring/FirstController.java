package pl.pg.asobecki.wai.spring;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

/**
 * Created by asobecki on 29.03.17.
 */
@RestController
public class FirstController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "First rest action from spring controller class";
    }

    @RequestMapping(value ="/second/{number}")
    public Integer drugaAkcja(@PathVariable(name = "number", required = false) Integer xx) {
        return 22+xx;
    }
}
