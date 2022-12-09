package com.example.demo.muscle.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HamstringController {

    @GetMapping(value = "member/hamstrings_band_beginner")
    public String Login_hamstrings_band_beginner_afterlogin() {

        return "hamstrings_band_beginner_afterlogin";
    }

    @GetMapping(value = "member/hamstrings_barbell_beginner")
    public String Login_hamstrings_barbell_beginnerafterlogin() {

        return "hamstrings_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/hamstrings_bodyweight_beginner")
    public String Login_hamstrings_bodyweight_beginner_afterlogin() {

        return "hamstrings_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "member/hamstrings_cable_beginner")
    public String Login_hamstrings_cable_beginner_afterlogin() {

        return "hamstrings_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/hamstrings_dumbell_beginner")
    public String Login_hamstrings_dumbell_beginner_afterlogin() {

        return "hamstrings_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/hamstrings_kettlebell_beginner")
    public String Login_hamstrings_kettlebell_beginner_afterlogin() {

        return "hamstrings_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/hamstrings_machine_beginner")
    public String Login_hamstrings_machine_beginner_afterlogin() {

        return "hamstrings_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/hamstrings_stretch_beginner")
    public String Login_hamstrings_stretch_beginner_afterlogin() {

        return "hamstrings_stretch_beginner_afterlogin";
    }

}
