package com.example.demo.muscle.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LowerbackController {

    @GetMapping(value = "member/lowerback_band_beginner")
    public String Login_lowerback_band_beginner_afterlogin() {

        return "lowerback_band_beginner_afterlogin";
    }

    @GetMapping(value = "member/lowerback_barbell_beginner")
    public String Login_lowerback_barbell_beginner_afterlogin() {

        return "lowerback_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/lowerback_bodyweight_beginner")
    public String Login_lowerback_bodyweight_beginner_afterlogin() {

        return "lowerback_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "member/lowerback_cable_beginner")
    public String Login_lowerback_cable_beginner_afterlogin() {

        return "lowerback_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/lowerback_dumbell_beginner")
    public String Login_lowerback_dumbell_beginner_afterlogin() {

        return "lowerback_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/lowerback_kettlebell_beginner")
    public String Login_lowerback_kettlebell_beginner_afterlogin() {

        return "lowerback_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/lowerback_machine_beginner")
    public String Login_lowerback_machine_beginner_afterlogin() {

        return "lowerback_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/lowerback_stretch_beginner")
    public String Login_lowerback_stretch_beginner_afterlogin() {

        return "lowerback_stretch_beginner_afterlogin";
    }


}
