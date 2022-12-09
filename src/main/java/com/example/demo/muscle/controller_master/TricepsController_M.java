package com.example.demo.muscle.controller_master;


import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor

public class TricepsController_M {

    private MuscleService muscleService;

    @GetMapping(value = "/triceps_dumbell_master")
    public String triceps_dumbell_master() {

        return "triceps_dumbell_master";
    }


    @GetMapping(value = "member/triceps_dumbell_master")
    public String Login_triceps_dumbell_master() {

        return "triceps_dumbell_master_afterlogin";
    }

    @GetMapping(value = "triceps_bodyweight_master")
    public String triceps_bodyweight_master() {

        return "triceps_bodyweight_master";
    }

    @GetMapping(value = "member/triceps_bodyweight_master")
    public String Login_triceps_bodyweight_master() {

        return "triceps_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "triceps_machine_master")
    public String triceps_machine_master() {

        return "triceps_machine_master";
    }

    @GetMapping(value = "member/triceps_machine_master")
    public String Login_triceps_machine_master() {

        return "triceps_machine_master_afterlogin";
    }

    @GetMapping(value = "triceps_barbell_master")
    public String triceps_barbell_master() {

        return "triceps_barbell_master";
    }

    @GetMapping(value = "member/triceps_barbell_master")
    public String Login_triceps_barbell_master() {

        return "triceps_barbell_master_afterlogin";
    }

    @GetMapping(value = "triceps_band_master")
    public String triceps_band_master() {

        return "triceps_band_master";
    }

    @GetMapping(value = "member/triceps_band_master")
    public String Login_triceps_band_master() {

        return "triceps_band_master_afterlogin";
    }

    @GetMapping(value = "triceps_stretch_master")
    public String triceps_stretch_master() {

        return "triceps_stretch_master";
    }

    @GetMapping(value = "member/triceps_stretch_master")
    public String Login_triceps_stretch_master() {

        return "triceps_stretch_master_afterlogin";
    }

    @GetMapping(value = "triceps_cable_master")
    public String triceps_cable_master() {

        return "triceps_cable_master";
    }

    @GetMapping(value = "member/triceps_cable_master")
    public String Login_triceps_cable_master() {

        return "triceps_cable_master_afterlogin";
    }

    @GetMapping(value = "triceps_kettlebell_master")
    public String triceps_kettlebell_master() {

        return "triceps_kettlebell_master";
    }

    @GetMapping(value = "member/triceps_kettlebell_master")
    public String Login_triceps_kettlebell_master() {

        return "triceps_kettlebell_master_afterlogin";
    }
}
