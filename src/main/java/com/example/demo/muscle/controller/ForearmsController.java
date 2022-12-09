package com.example.demo.muscle.controller;


import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ForearmsController {

    private MuscleService muscleService;

    @GetMapping(value = "member/forearms_band_beginner")
    public String Login_forearms_band_beginner_afterlogin() {

        return "forearms_band_beginner_afterlogin";
    }

    @GetMapping(value = "member/forearms_barbell_beginner")
    public String Login_forearms_barbell_beginner_afterlogin() {

        return "forearms_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/forearms_bodyweight_beginner")
    public String Login_forearms_bodyweight_beginner_afterlogin() {

        return "forearms_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "member/forearms_cable_beginner")
    public String Login_forearms_cable_beginner_afterlogin() {

        return "forearms_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/forearms_dumbell_beginner")
    public String Login_forearms_dumbell_beginner_afterlogin() {

        return "forearms_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/forearms_kettlebell_beginner")
    public String Login_forearms_kettlebell_beginner_afterlogin() {

        return "forearms_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/forearms_stretch_beginner")
    public String Login_forearms_stretch_beginner_afterlogin() {

        return "forearms_stretch_beginner_afterlogin";
    }

    @GetMapping(value = "member/forearms_machine_beginner")
    public String Login_forearms_machine_beginner_afterlogin() {

        return "forearms_machine_beginner_afterlogin";
    }
}
