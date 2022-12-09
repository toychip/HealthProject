package com.example.demo.muscle.controller;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ShouldersController {

    private MuscleService muscleService;

    @GetMapping(value = "member/shoulders_band_beginner")
    public String Login_shoulders_band_beginner_afterlogin() {

        return "shoulders_band_beginner_afterlogin";
    }

    @GetMapping(value = "member/shoulders_barbell_beginner")
    public String Login_shoulders_barbell_beginner_afterlogin() {

        return "shoulders_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/shoulders_bodyweight_beginner")
    public String Login_shoulders_bodyweight_beginner_afterlogin() {

        return "shoulders_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "member/shoulders_cable_beginner")
    public String Login_shoulders_cable_beginner_afterlogin() {

        return "shoulders_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/shoulders_dumbell_beginner")
    public String Login_shoulders_dumbell_beginner_afterlogin() {

        return "shoulders_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/shoulders_kettlebell_beginner")
    public String Login_quads_band_beginner_afterlogin() {

        return "shoulders_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/shoulders_machine_beginner")
    public String Login_shoulders_machine_beginner_afterlogin() {

        return "shoulders_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/shoulders_stretch_beginner")
    public String Login_shoulders_stretch_beginner_afterlogin() {

        return "shoulders_stretch_beginner_afterlogin";
    }
}
