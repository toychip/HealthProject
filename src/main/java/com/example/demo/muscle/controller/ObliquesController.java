package com.example.demo.muscle.controller;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ObliquesController {

    private MuscleService muscleService;

    @GetMapping(value = "member/obliques_band_beginner")
    public String Login_obliques_band_beginner_afterlogin() {

        return "obliques_band_beginner_afterlogin";
    }

    @GetMapping(value = "member/obliques_barbell_beginner")
    public String Login_obliques_barbell_beginner_afterlogin() {

        return "obliques_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/obliques_bodyweight_beginner")
    public String Login_obliques_bodyweight_beginner_afterlogin() {

        return "obliques_stretch_beginner_afterlogin";
    }

    @GetMapping(value = "member/obliques_cable_beginner")
    public String Login_obliques_cable_beginner_afterlogin() {

        return "obliques_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/obliques_dumbell_beginner")
    public String Login_obliques_dumbell_beginner_afterlogin() {

        return "obliques_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/obliques_kettlebell_beginner")
    public String Login_obliques_kettlebell_beginner_afterlogin() {

        return "obliques_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/obliques_machine_beginner")
    public String Login_obliques_machine_beginner_afterlogin() {

        return "obliques_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/obliques_stretch_beginner")
    public String Login_obliques_stretch_beginner_afterlogin() {

        return "obliques_stretch_beginner_afterlogin";
    }
}
