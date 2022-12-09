package com.example.demo.muscle.controller;


import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BicepsController {

    private MuscleService muscleService;

    @GetMapping(value = "member/biceps_band_beginner")
    public String Login_biceps_band_beginner_afterlogin() {

        return "biceps_band_beginner_afterlogin";
    }


    @GetMapping(value = "member/biceps_barbell_beginner")
    public String Login_biceps_barbell_beginner_afterlogin() {

        return "biceps_barbell_beginner_afterlogin";
    }


    @GetMapping(value = "member/biceps_bodyweight_beginner")
    public String Login_biceps_bodyweight_beginner_afterlogin() {

        return "biceps_bodyweight_beginner_afterlogin";
    }


    @GetMapping(value = "member/biceps_cable_beginner")
    public String Login_biceps_cable_beginner_afterlogin() {

        return "biceps_cable_beginner_afterlogin";
    }


    @GetMapping(value = "member/biceps_dumbell_beginner")
    public String Login_biceps_dumbell_beginner_afterlogin() {

        return "biceps_dumbell_beginner_afterlogin";
    }


    @GetMapping(value = "member/biceps_kettlebell_beginner")
    public String Login_biceps_kettlebell_beginner_afterlogin() {

        return "biceps_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/biceps_machine_beginner")
    public String Login_biceps_machine_beginner_afterlogin() {

        return "biceps_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/biceps_stretch_beginner")
    public String Login_biceps_stretch_beginner_afterlogin() {

        return "biceps_stretch_beginner_afterlogin";
    }

}
