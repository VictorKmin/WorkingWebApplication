package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class InitController {

    @GetMapping("/")
    public String start() {
        return "index";
    }

}
