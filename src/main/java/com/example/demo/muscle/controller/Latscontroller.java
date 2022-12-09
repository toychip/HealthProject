package com.example.demo.muscle.controller;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class Latscontroller {

    private MuscleService muscleService;



    @GetMapping(value = "member/lats_band_beginner")
    public String Login_lats_band_beginner() {

        return "lats_band_beginner_afterlogin";
    }

    @GetMapping(value = "member/lats_barbell_beginner")
    public String Login_lats_barbell_beginner() {

        return "lats_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/lats_bodyweight_beginner")
    public String Login_lats_bodyweight_beginner_afterlogin() {

        return "lats_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "member/lats_cable_beginner")
    public String Login_lats_cable_beginner_afterlogin() {

        return "lats_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/lats_dumbell_beginner")
    public String Login_lats_dumbell_beginner_afterlogin() {

        return "lats_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/lats_kettlebell_beginner")
    public String Login_lats_kettlebell_beginner_afterlogin() {

        return "lats_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/lats_stretch_beginner")
    public String Login_lats_stretch_beginner_afterlogin() {

        return "lats_stretch_beginner_afterlogin";
    }

    @GetMapping(value = "member/lats_machine_beginner")
    public String Login_lats_machine_beginner_afterlogin() {

        return "lats_machine_beginner_afterlogin";
    }


}
