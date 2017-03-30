package pl.pg.asobecki.wai.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by asobecki on 29.03.17.
 */
@Controller
public class SecondController {

    @Value("${default.welcome.message}")
    private String msg = "Some text";

    @RequestMapping("/")
    public String someAction(@RequestParam(value="name", required = false) String name, Model model) {
        if(name == null)
            name = msg;
        model.addAttribute("name", name);

        return "welcome-view";
    }
}
