package com.example.demo.muscle.controller_master;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LowerbackController_M {

    @GetMapping(value = "/lowerback_dumbell_master")
    public String lowerback_dumbell_master() {

        return "lowerback_dumbell_master";
    }


    @GetMapping(value = "member/lowerback_dumbell_master")
    public String Login_lowerback_dumbell_master() {

        return "lowerback_dumbell_master_afterlogin";
    }

    @GetMapping(value = "lowerback_bodyweight_master")
    public String lowerback_bodyweight_master() {

        return "lowerback_bodyweight_master";
    }

    @GetMapping(value = "member/lowerback_bodyweight_master")
    public String Login_lowerback_bodyweight_master() {

        return "lowerback_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "lowerback_machine_master")
    public String lowerback_machine_master() {

        return "lowerback_machine_master";
    }

    @GetMapping(value = "member/lowerback_machine_master")
    public String Login_lowerback_machine_master() {

        return "lowerback_machine_master_afterlogin";
    }

    @GetMapping(value = "lowerback_barbell_master")
    public String lowerback_barbell_master() {

        return "lowerback_barbell_master";
    }

    @GetMapping(value = "member/lowerback_barbell_master")
    public String Login_lowerback_barbell_master() {

        return "lowerback_barbell_master_afterlogin";
    }

    @GetMapping(value = "lowerback_band_master")
    public String lowerback_band_master() {

        return "lowerback_band_master";
    }

    @GetMapping(value = "member/lowerback_band_master")
    public String Login_lowerback_band_master() {

        return "lowerback_band_master_afterlogin";
    }

    @GetMapping(value = "lowerback_stretch_master")
    public String lowerback_stretch_master() {

        return "lowerback_stretch_master";
    }

    @GetMapping(value = "member/lowerback_stretch_master")
    public String Login_lowerback_stretch_master() {

        return "lowerback_stretch_master_afterlogin";
    }

    @GetMapping(value = "lowerback_cable_master")
    public String lowerback_cable_master() {

        return "lowerback_cable_master";
    }

    @GetMapping(value = "member/lowerback_cable_master")
    public String Login_lowerback_cable_master() {

        return "lowerback_cable_master_afterlogin";
    }

    @GetMapping(value = "lowerback_kettlebell_master")
    public String lowerback_kettlebell_master() {

        return "lowerback_kettlebell_master";
    }

    @GetMapping(value = "member/lowerback_kettlebell_master")
    public String Login_lowerback_kettlebell_master() {

        return "lowerback_kettlebell_master_afterlogin";
    }
}
