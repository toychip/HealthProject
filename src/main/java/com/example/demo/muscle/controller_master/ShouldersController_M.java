package com.example.demo.muscle.controller_master;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ShouldersController_M {

    private MuscleService muscleService;

    @GetMapping(value = "/shoulders_dumbell_master")
    public String shoulders_dumbell_master() {

        return "shoulders_dumbell_master";
    }


    @GetMapping(value = "member/shoulders_dumbell_master")
    public String Login_shoulders_dumbell_master() {

        return "shoulders_dumbell_master_afterlogin";
    }

    @GetMapping(value = "shoulders_bodyweight_master")
    public String shoulders_bodyweight_master() {

        return "shoulders_bodyweight_master";
    }

    @GetMapping(value = "member/shoulders_bodyweight_master")
    public String Login_shoulders_bodyweight_master() {

        return "shoulders_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "shoulders_machine_master")
    public String shoulders_machine_master() {

        return "shoulders_machine_master";
    }

    @GetMapping(value = "member/shoulders_machine_master")
    public String Login_shoulders_machine_master() {

        return "shoulders_machine_master_afterlogin";
    }

    @GetMapping(value = "shoulders_barbell_master")
    public String shoulders_barbell_master() {

        return "shoulders_barbell_master";
    }

    @GetMapping(value = "member/shoulders_barbell_master")
    public String Login_shoulders_barbell_master() {

        return "shoulders_barbell_master_afterlogin";
    }

    @GetMapping(value = "shoulders_band_master")
    public String shoulders_band_master() {

        return "shoulders_band_master";
    }

    @GetMapping(value = "member/shoulders_band_master")
    public String Login_shoulders_band_master() {

        return "shoulders_band_master_afterlogin";
    }

    @GetMapping(value = "shoulders_stretch_master")
    public String shoulders_stretch_master() {

        return "shoulders_stretch_master";
    }

    @GetMapping(value = "member/shoulders_stretch_master")
    public String Login_shoulders_stretch_master() {

        return "shoulders_stretch_master_afterlogin";
    }

    @GetMapping(value = "shoulders_cable_master")
    public String shoulders_cable_master() {

        return "shoulders_cable_master";
    }

    @GetMapping(value = "member/shoulders_cable_master")
    public String Login_shoulders_cable_master() {

        return "shoulders_cable_master_afterlogin";
    }

    @GetMapping(value = "shoulders_kettlebell_master")
    public String shoulders_kettlebell_master() {

        return "shoulders_kettlebell_master";
    }

    @GetMapping(value = "member/shoulders_kettlebell_master")
    public String Login_shoulders_kettlebell_master() {

        return "shoulders_kettlebell_master_afterlogin";
    }
}
