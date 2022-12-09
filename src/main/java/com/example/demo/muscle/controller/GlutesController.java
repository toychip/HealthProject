package com.example.demo.muscle.controller;


import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class GlutesController {

    private MuscleService muscleService;

    @GetMapping(value = "member/glutes_band_beginner")
    public String Login_glutes_band_beginner_afterlogin() {

        return "glutes_band_beginner_afterlogin";
    }


    @GetMapping(value = "member/glutes_barbell_beginner")
    public String Login_glutes_barbell_beginner_afterlogin() {

        return "glutes_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/glutes_cable_beginner")
    public String Login_glutes_cable_beginner_afterlogin() {

        return "glutes_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/glutes_dumbell_beginner")
    public String Login_glutes_dumbell_beginner_afterlogin() {

        return "glutes_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/glutes_kettlebell_beginner")
    public String Login_glutes_kettlebell_beginner_afterlogin() {

        return "glutes_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/glutes_machine_beginner")
    public String Login_glutes_machine_beginner_afterlogin() {

        return "glutes_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/glutes_stretch_beginner")
    public String Login_glutes_stretch_beginner_afterlogin() {

        return "glutes_stretch_beginner_afterlogin";
    }

    @GetMapping(value = "member/glutes_bodyweight_beginner")
    public String Login_glutes_bodyweight_beginner_afterlogin() {

        return "glutes_bodyweight_beginner_afterlogin";
    }
}
