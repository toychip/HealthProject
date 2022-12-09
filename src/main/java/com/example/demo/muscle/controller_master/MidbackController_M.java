package com.example.demo.muscle.controller_master;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MidbackController_M {

    private MuscleService muscleService;

//    @GetMapping(value = "member/midback_band_beginner")
//    public String Login_midback_band_beginner_afterlogin() {
//
//        return "midback_band_beginner_afterlogin";
//    }

    @GetMapping(value = "/midback_dumbell_master")
    public String midback_dumbell_master() {

        return "midback_dumbell_master";
    }


    @GetMapping(value = "member/midback_dumbell_master")
    public String Login_midback_dumbell_master() {

        return "midback_dumbell_master_afterlogin";
    }

    @GetMapping(value = "midback_bodyweight_master")
    public String midback_bodyweight_master() {

        return "midback_bodyweight_master";
    }

    @GetMapping(value = "member/midback_bodyweight_master")
    public String Login_midback_bodyweight_master() {

        return "midback_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "midback_machine_master")
    public String midback_machine_master() {

        return "midback_machine_master";
    }

    @GetMapping(value = "member/midback_machine_master")
    public String Login_midback_machine_master() {

        return "midback_machine_master_afterlogin";
    }

    @GetMapping(value = "midback_barbell_master")
    public String midback_barbell_master() {

        return "midback_barbell_master";
    }

    @GetMapping(value = "member/midback_barbell_master")
    public String Login_midback_barbell_master() {

        return "midback_barbell_master_afterlogin";
    }

    @GetMapping(value = "midback_band_master")
    public String midback_band_master() {

        return "midback_band_master";
    }

    @GetMapping(value = "member/midback_band_master")
    public String Login_midback_band_master() {

        return "midback_band_master_afterlogin";
    }

    @GetMapping(value = "midback_stretch_master")
    public String midback_stretch_master() {

        return "midback_stretch_master";
    }

    @GetMapping(value = "member/midback_stretch_master")
    public String Login_midback_stretch_master() {

        return "midback_stretch_master_afterlogin";
    }

    @GetMapping(value = "midback_cable_master")
    public String midback_cable_master() {

        return "midback_cable_master";
    }

    @GetMapping(value = "member/midback_cable_master")
    public String Login_midback_cable_master() {

        return "midback_cable_master_afterlogin";
    }

    @GetMapping(value = "midback_kettlebell_master")
    public String midback_kettlebell_master() {

        return "midback_kettlebell_master";
    }

    @GetMapping(value = "member/midback_kettlebell_master")
    public String Login_midback_kettlebell_master() {

        return "midback_kettlebell_master_afterlogin";
    }















}
