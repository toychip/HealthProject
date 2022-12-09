package com.example.demo.muscle.controller_master;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class Latscontroller_M {

    private MuscleService muscleService;

    @GetMapping(value = "/lats_dumbell_master")
    public String lats_dumbell_master() {

        return "lats_dumbell_master";
    }


    @GetMapping(value = "member/lats_dumbell_master")
    public String Login_lats_dumbell_master() {

        return "lats_dumbell_master_afterlogin";
    }

    @GetMapping(value = "lats_bodyweight_master")
    public String lats_bodyweight_master() {

        return "lats_bodyweight_master";
    }

    @GetMapping(value = "member/lats_bodyweight_master")
    public String Login_lats_bodyweight_master() {

        return "lats_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "lats_machine_master")
    public String lats_machine_master() {

        return "lats_machine_master";
    }

    @GetMapping(value = "member/lats_machine_master")
    public String Login_lats_machine_master() {

        return "lats_machine_master_afterlogin";
    }

    @GetMapping(value = "lats_barbell_master")
    public String lats_barbell_master() {

        return "lats_barbell_master";
    }

    @GetMapping(value = "member/lats_barbell_master")
    public String Login_lats_barbell_master() {

        return "lats_barbell_master_afterlogin";
    }

    @GetMapping(value = "lats_band_master")
    public String lats_band_master() {

        return "lats_band_master";
    }

    @GetMapping(value = "member/lats_band_master")
    public String Login_lats_band_master() {

        return "lats_band_master_afterlogin";
    }

    @GetMapping(value = "lats_stretch_master")
    public String lats_stretch_master() {

        return "lats_stretch_master";
    }

    @GetMapping(value = "member/lats_stretch_master")
    public String Login_lats_stretch_master() {

        return "lats_stretch_master_afterlogin";
    }

    @GetMapping(value = "lats_cable_master")
    public String lats_cable_master() {

        return "lats_cable_master";
    }

    @GetMapping(value = "member/lats_cable_master")
    public String Login_lats_cable_master() {

        return "lats_cable_master_afterlogin";
    }

    @GetMapping(value = "lats_kettlebell_master")
    public String lats_kettlebell_master() {

        return "lats_kettlebell_master";
    }

    @GetMapping(value = "member/lats_kettlebell_master")
    public String Login_lats_kettlebell_master() {

        return "lats_kettlebell_master_afterlogin";
    }
}
