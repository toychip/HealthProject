package com.example.demo.muscle.controller_master;


import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BicepsController_M {

    private MuscleService muscleService;

    @GetMapping(value = "/biceps_dumbell_master")
    public String biceps_dumbell_master() {

        return "biceps_dumbell_master";
    }


    @GetMapping(value = "member/biceps_dumbell_master")
    public String Login_biceps_dumbell_master() {

        return "biceps_dumbell_master_afterlogin";
    }

    @GetMapping(value = "biceps_bodyweight_master")
    public String biceps_bodyweight_master() {

        return "biceps_bodyweight_master";
    }

    @GetMapping(value = "member/biceps_bodyweight_master")
    public String Login_biceps_bodyweight_master() {

        return "biceps_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "biceps_machine_master")
    public String biceps_machine_master() {

        return "biceps_machine_master";
    }

    @GetMapping(value = "member/biceps_machine_master")
    public String Login_biceps_machine_master() {

        return "biceps_machine_master_afterlogin";
    }

    @GetMapping(value = "biceps_barbell_master")
    public String biceps_barbell_master() {

        return "biceps_barbell_master";
    }

    @GetMapping(value = "member/biceps_barbell_master")
    public String Login_biceps_barbell_master() {

        return "biceps_barbell_master_afterlogin";
    }

    @GetMapping(value = "biceps_band_master")
    public String biceps_band_master() {

        return "biceps_band_master";
    }

    @GetMapping(value = "member/biceps_band_master")
    public String Login_biceps_band_master() {

        return "biceps_band_master_afterlogin";
    }

    @GetMapping(value = "biceps_stretch_master")
    public String biceps_stretch_master() {

        return "biceps_stretch_master";
    }

    @GetMapping(value = "member/biceps_stretch_master")
    public String Login_biceps_stretch_master() {

        return "biceps_stretch_master_afterlogin";
    }

    @GetMapping(value = "biceps_cable_master")
    public String biceps_cable_master() {

        return "biceps_cable_master";
    }

    @GetMapping(value = "member/biceps_cable_master")
    public String Login_biceps_cable_master() {

        return "biceps_cable_master_afterlogin";
    }

    @GetMapping(value = "biceps_kettlebell_master")
    public String biceps_kettlebell_master() {

        return "biceps_kettlebell_master";
    }

    @GetMapping(value = "member/biceps_kettlebell_master")
    public String Login_biceps_kettlebell_master() {

        return "biceps_kettlebell_master_afterlogin";
    }

}
