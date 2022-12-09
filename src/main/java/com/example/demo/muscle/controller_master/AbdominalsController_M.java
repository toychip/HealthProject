package com.example.demo.muscle.controller_master;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AbdominalsController_M {

//    private MuscleService muscleService;

    @GetMapping(value = "/abdominals_dumbell_master")
    public String GoTodumbell() {

        return "abdominals_dumbell_master";
    }


    @GetMapping(value = "member/abdominals_dumbell_master")
    public String LoginGoTodumbell() {

        return "abdominals_dumbell_master_afterlogin";
    }

    @GetMapping(value = "abdominals_bodyweight_master")
    public String abdominals_bodyweight_master() {

        return "abdominals_bodyweight_master";
    }

    @GetMapping(value = "member/abdominals_bodyweight_master")
    public String Login_abdominals_bodyweight_master() {

        return "abdominals_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "abdominals_machine_master")
    public String abdominals_machine_master() {

        return "abdominals_machine_master";
    }

    @GetMapping(value = "member/abdominals_machine_master")
    public String Login_abdominals_machine_master() {

        return "abdominals_machine_master_afterlogin";
    }

    @GetMapping(value = "abdominals_barbell_master")
    public String abdominals_barbell_master() {

        return "abdominals_barbell_master";
    }

    @GetMapping(value = "member/abdominals_barbell_master")
    public String Login_abdominals_barbell_master() {

        return "abdominals_barbell_master_afterlogin";
    }

    @GetMapping(value = "abdominals_band_master")
    public String abdominals_band_master() {

        return "abdominals_band_master";
    }

    @GetMapping(value = "member/abdominals_band_master")
    public String Login_abdominals_band_master() {

        return "abdominals_band_master_afterlogin";
    }

    @GetMapping(value = "abdominals_stretch_master")
    public String abdominals_stretch_master() {

        return "abdominals_stretch_master";
    }

    @GetMapping(value = "member/abdominals_stretch_master")
    public String Login_abdominals_stretch_master() {

        return "abdominals_stretch_master_afterlogin";
    }

    @GetMapping(value = "abdominals_cable_master")
    public String abdominals_cable_master() {

        return "abdominals_cable_master";
    }

    @GetMapping(value = "member/abdominals_cable_master")
    public String Login_abdominals_cable_master() {

        return "abdominals_cable_master_afterlogin";
    }

    @GetMapping(value = "abdominals_kettlebell_master")
    public String abdominals_kettlebell_master() {

        return "abdominals_kettlebell_master";
    }

    @GetMapping(value = "member/abdominals_kettlebell_master")
    public String Login_abdominals_kettlebell_master() {

        return "abdominals_kettlebell_master_afterlogin";
    }
}
