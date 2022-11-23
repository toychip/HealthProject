package com.example.demo.homepage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping (value = "/beginner-main")
    public String goBeginner() {
        return "/beginner-main";
    }

    @GetMapping(value = "/master-main")
    public String goMaster() {
        return "/master-main";
    }
}
