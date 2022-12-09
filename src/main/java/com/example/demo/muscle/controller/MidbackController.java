package com.example.demo.muscle.controller;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MidbackController {

    private MuscleService muscleService;

//    @GetMapping(value = "member/midback_band_beginner")
//    public String Login_midback_band_beginner_afterlogin() {
//
//        return "midback_band_beginner_afterlogin";
//    }

    @GetMapping(value = "member/midback_barbell_beginner")
    public String Login_midback_barbell_beginner_afterlogin() {

        return "midback_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/midback_band_beginner")
    public String Login_midback_band_beginner_afterlogin() {

        return "midback_band_beginner_afterlogin";
    }

    @GetMapping(value = "member/midback_bodyweight_beginner")
    public String Login_midback_bodyweight_beginner_afterlogin() {

        return "midback_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "member/midback_cable_beginner")
    public String Login_midback_cable_beginner_afterlogin() {

        return "midback_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/midback_dumbell_beginner")
    public String Login_midback_dumbell_beginner_afterlogin() {

        return "midback_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/midback_kettlebell_beginner")
    public String Login_midback_kettlebell_beginner_afterlogin() {

        return "midback_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/midback_machine_beginner")
    public String Login_midback_machine_beginner_afterlogin() {

        return "midback_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/midback_stretch_beginner")
    public String Login_midback_stretch_beginner_afterlogin() {

        return "midback_stretch_beginner_afterlogin";
    }
















}
