package com.example.demo.muscle.controller_master;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ObliquesController_M {

    private MuscleService muscleService;

    @GetMapping(value = "/obliques_dumbell_master")
    public String obliques_dumbell_master() {

        return "obliques_dumbell_master";
    }


    @GetMapping(value = "member/obliques_dumbell_master")
    public String Login_obliques_dumbell_master() {

        return "obliques_dumbell_master_afterlogin";
    }

    @GetMapping(value = "obliques_bodyweight_master")
    public String obliques_bodyweight_master() {

        return "obliques_bodyweight_master";
    }

    @GetMapping(value = "member/obliques_bodyweight_master")
    public String Login_obliques_bodyweight_master() {

        return "obliques_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "obliques_machine_master")
    public String obliques_machine_master() {

        return "obliques_machine_master";
    }

    @GetMapping(value = "member/obliques_machine_master")
    public String Login_obliques_machine_master() {

        return "obliques_machine_master_afterlogin";
    }

    @GetMapping(value = "obliques_barbell_master")
    public String obliques_barbell_master() {

        return "obliques_barbell_master";
    }

    @GetMapping(value = "member/obliques_barbell_master")
    public String Login_obliques_barbell_master() {

        return "obliques_barbell_master_afterlogin";
    }

    @GetMapping(value = "obliques_band_master")
    public String obliques_band_master() {

        return "obliques_band_master";
    }

    @GetMapping(value = "member/obliques_band_master")
    public String Login_obliques_band_master() {

        return "obliques_band_master_afterlogin";
    }

    @GetMapping(value = "obliques_stretch_master")
    public String obliques_stretch_master() {

        return "obliques_stretch_master";
    }

    @GetMapping(value = "member/obliques_stretch_master")
    public String Login_obliques_stretch_master() {

        return "obliques_stretch_master_afterlogin";
    }

    @GetMapping(value = "obliques_cable_master")
    public String obliques_cable_master() {

        return "obliques_cable_master";
    }

    @GetMapping(value = "member/obliques_cable_master")
    public String Login_obliques_cable_master() {

        return "obliques_cable_master_afterlogin";
    }

    @GetMapping(value = "obliques_kettlebell_master")
    public String obliques_kettlebell_master() {

        return "obliques_kettlebell_master";
    }

    @GetMapping(value = "member/obliques_kettlebell_master")
    public String Login_obliques_kettlebell_master() {

        return "obliques_kettlebell_master_afterlogin";
    }
}
