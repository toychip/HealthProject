package com.example.demo.muscle.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TrapsController {

    @GetMapping(value = "member/traps_band_beginner")
    public String Login_traps_band_beginner_afterlogin() {

        return "traps_band_beginner_afterlogin";
    }

    @GetMapping(value = "member/traps_barbell_beginner")
    public String Login_traps_barbell_beginner_afterlogin() {

        return "traps_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/traps_bodyweight_beginner")
    public String Login_traps_bodyweight_beginner_afterlogin() {

        return "traps_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "member/traps_cable_beginner")
    public String Login_traps_cable_beginner_afterlogin() {

        return "traps_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/traps_dumbell_beginner")
    public String Login_traps_dumbell_beginner_afterlogin() {

        return "traps_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/traps_kettlebell_beginner")
    public String Login_traps_kettlebell_beginner_afterlogin() {

        return "traps_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/traps_machine_beginner")
    public String Login_traps_machine_beginner_afterlogin() {

        return "traps_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/traps_stretch_beginner")
    public String Login_traps_stretch_beginner_afterlogin() {

        return "traps_stretch_beginner_afterlogin";
    }
}
