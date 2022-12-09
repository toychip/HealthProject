package com.example.demo.muscle.controller_master;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TrapsController_M {

    @GetMapping(value = "/traps_dumbell_master")
    public String traps_dumbell_master() {

        return "traps_dumbell_master";
    }


    @GetMapping(value = "member/traps_dumbell_master")
    public String Login_traps_dumbell_master() {

        return "traps_dumbell_master_afterlogin";
    }

    @GetMapping(value = "traps_bodyweight_master")
    public String traps_bodyweight_master() {

        return "traps_bodyweight_master";
    }

    @GetMapping(value = "member/traps_bodyweight_master")
    public String Login_traps_bodyweight_master() {

        return "traps_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "traps_machine_master")
    public String traps_machine_master() {

        return "traps_machine_master";
    }

    @GetMapping(value = "member/traps_machine_master")
    public String Login_traps_machine_master() {

        return "traps_machine_master_afterlogin";
    }

    @GetMapping(value = "traps_barbell_master")
    public String traps_barbell_master() {

        return "traps_barbell_master";
    }

    @GetMapping(value = "member/traps_barbell_master")
    public String Login_traps_barbell_master() {

        return "traps_barbell_master_afterlogin";
    }

    @GetMapping(value = "traps_band_master")
    public String traps_band_master() {

        return "traps_band_master";
    }

    @GetMapping(value = "member/traps_band_master")
    public String Login_traps_band_master() {

        return "traps_band_master_afterlogin";
    }

    @GetMapping(value = "traps_stretch_master")
    public String traps_stretch_master() {

        return "traps_stretch_master";
    }

    @GetMapping(value = "member/traps_stretch_master")
    public String Login_traps_stretch_master() {

        return "traps_stretch_master_afterlogin";
    }

    @GetMapping(value = "traps_cable_master")
    public String traps_cable_master() {

        return "traps_cable_master";
    }

    @GetMapping(value = "member/traps_cable_master")
    public String Login_traps_cable_master() {

        return "traps_cable_master_afterlogin";
    }

    @GetMapping(value = "traps_kettlebell_master")
    public String traps_kettlebell_master() {

        return "traps_kettlebell_master";
    }

    @GetMapping(value = "member/traps_kettlebell_master")
    public String Login_traps_kettlebell_master() {

        return "traps_kettlebell_master_afterlogin";
    }
}
