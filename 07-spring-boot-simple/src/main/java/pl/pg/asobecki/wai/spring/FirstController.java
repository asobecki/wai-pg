package pl.pg.asobecki.wai.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asobecki on 29.03.17.
 */
@RestController
public class FirstController {

    @RequestMapping("/")
    public String index() {
        return "First rest action from spring controller class";
    }
}
