package com.example.demo.muscle.controller;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AbdominalsController {

    private MuscleService muscleService;

    @GetMapping(value = "member/abdominals_band_beginner")
    public String Login_abdominals_band_beginner_afterlogin() {

        return "abdominals_band_beginner_afterlogin";
    }

    @GetMapping(value = "member/abdominals_barbell_beginner")
    public String Login_abdominals_barbell_beginner_afterlogin() {

        return "abdominals_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "member/abdominals_bodyweight_beginner")
    public String Login_abdominals_bodyweight_beginner_afterlogin() {

        return "abdominals_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "member/abdominals_cable_beginner")
    public String Login_abdominals_cable_beginner_afterlogin() {

        return "abdominals_cable_beginner_afterlogin";
    }

    @GetMapping(value = "member/abdominals_dumbell_beginner")
    public String Login_abdominals_dumbell_beginner() {

        return "abdominals_dumbell_beginner_afterlogin";
    }


    @GetMapping(value = "member/abdominals_kettlebell_beginner")
    public String Login_abdominals_kettlebell_beginner_afterlogin() {

        return "abdominals_kettlebell_beginner_afterlogin";
    }



    @GetMapping(value = "member/abdominals_machine_beginner")
    public String Login_abdominals_machine_beginner_afterlogin() {

        return "abdominals_machine_beginner_afterlogin";
    }

    @GetMapping(value = "member/abdominals_stretch_beginner")
    public String Login_abdominals_stretch_beginner_afterlogin() {

        return "abdominals_stretch_beginner_afterlogin";
    }

}
