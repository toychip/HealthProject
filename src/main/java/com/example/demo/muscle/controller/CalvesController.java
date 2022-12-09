package com.example.demo.muscle.controller;


import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CalvesController {

    private MuscleService muscleService;


    @GetMapping(value = "member/calves_band_beginner")
    public String Login_calves_band_beginner_afterlogin() {

        return "calves_band_beginner_afterlogin";
    }


    @GetMapping(value = "member/calves_barbell_beginner")
    public String Login_calves_barbell_beginner_afterlogin() {

        return "calves_barbell_beginner_afterlogin";
    }


    @GetMapping(value = "member/calves_bodyweight_beginner")
    public String Login_calves_bodyweight_beginner_afterlogin() {

        return "calves_bodyweight_beginner_afterlogin";
    }


    @GetMapping(value = "member/calves_cable_beginner")
    public String Login_calves_cable_beginner_afterlogin() {

        return "calves_cable_beginner_afterlogin";
    }


    @GetMapping(value = "member/calves_dumbell_beginner")
    public String Login_calves_dumbell_beginner_afterlogin() {

        return "calves_dumbell_beginner_afterlogin";
    }


    @GetMapping(value = "member/calves_kettlebell_beginner")
    public String Login_calves_kettlebell_beginner_afterlogin() {

        return "calves_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/calves_machine_beginner")
    public String Login_calves_machine_beginner_afterlogin() {

        return "calves_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/calves_stretch_beginner")
    public String Login_calves_stretch_beginner_afterlogin() {

        return "calves_stretch_beginner_afterlogin";
    }



}
