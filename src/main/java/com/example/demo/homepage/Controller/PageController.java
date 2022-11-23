package com.example.demo.homepage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @GetMapping(value = "/member/master-main")
    public String MasterGoMain() {
        return "/master-main-afterlogin";
    }

    @GetMapping("/member/master-main-afterlogin")
    public String login_after_master_main() {
        return "master-main-afterlogin";
    }

    @GetMapping(value = "/member/beginner-main")
    public String BeginnerGoMain() {
        return "/beginner-main-afterlogin";
    }

    @GetMapping("/member/beginner-main-afterlogin")
    public String login_after_Beginner_main() {
        return "/beginner-main-afterlogin";
    }


    @GetMapping("/member/mypage")
    public String login_after_mypage() {
        return "mypage";
    }
}
