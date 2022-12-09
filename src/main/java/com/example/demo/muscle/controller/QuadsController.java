package com.example.demo.muscle.controller;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class QuadsController {

    private MuscleService muscleService;

    @GetMapping(value = "member/quads_band_beginner")
    public String Login_quads_band_beginner_afterlogin() {

        return "quads_band_beginner_afterlogin";
    }

    @GetMapping(value = "member/quads_barbell_beginner")
    public String Login_quads_barbell_beginner() {

        return "quads_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/quads_bodyweight_beginner")
    public String Login_quads_bodyweight_beginner_afterlogin() {

        return "quads_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "member/quads_cable_beginner")
    public String Login_quads_cable_beginner_afterlogin() {

        return "quads_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/quads_dumbell_beginner")
    public String Login_quads_dumbell_beginner_afterlogin() {

        return "quads_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/quads_kettlebell_beginner")
    public String Login_quads_kettlebell_beginner_afterlogin() {

        return "quads_kettlebell_beginner_afterlogin";
    }

    @GetMapping(value = "member/quads_machine_beginner")
    public String Login_quads_machine_beginner_afterlogin() {

        return "quads_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/quads_stretch_beginner")
    public String Login_quads_stretch_beginner_afterlogin() {

        return "quads_stretch_beginner_afterlogin";
    }


}
