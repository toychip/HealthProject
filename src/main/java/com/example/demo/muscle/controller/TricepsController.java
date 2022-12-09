package com.example.demo.muscle.controller;


import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor

public class TricepsController {

    private MuscleService muscleService;

    @GetMapping(value = "member/triceps_band_beginner")
    public String Login_triceps_band_beginner_afterlogin() {

        return "triceps_band_beginner_afterlogin";
    }


    @GetMapping(value = "member/triceps_barbell_beginner")
    public String Logintriceps_barbell_beginner_afterlogin() {

        return "triceps_barbell_beginner_afterlogin";
    }


    @GetMapping(value = "member/triceps_bodyweight_beginner")
    public String Login_triceps_bodyweight_beginner_afterlogin() {

        return "triceps_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "member/triceps_cable_beginner")
    public String Login_triceps_cable_beginner_afterlogin() {

        return "triceps_cable_beginner_afterlogin";
    }



    @GetMapping(value = "member/triceps_dumbell_beginner")
    public String Login_triceps_dumbell_beginner_afterlogin() {

        return "triceps_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/triceps_kettlebell_beginner")
    public String Login_triceps_kettlebell_beginner_afterlogin() {

        return "triceps_kettlebell_beginner_afterlogin";
    }


    @GetMapping(value = "member/triceps_machine_beginner")
    public String Login_triceps_machine_beginner_afterlogin() {

        return "triceps_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/triceps_stretch_beginner")
    public String Login_triceps_stretch_beginner_afterlogin() {

        return "triceps_stretch_beginner_afterlogin";
    }
}
