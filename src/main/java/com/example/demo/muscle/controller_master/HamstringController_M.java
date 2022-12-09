package com.example.demo.muscle.controller_master;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HamstringController_M {

    @GetMapping(value = "/hamstrings_dumbell_master")
    public String hamstrings_dumbell_master() {

        return "hamstrings_dumbell_master";
    }


    @GetMapping(value = "member/hamstrings_dumbell_master")
    public String Login_hamstrings_dumbell_master() {

        return "hamstrings_dumbell_master_afterlogin";
    }

    @GetMapping(value = "hamstrings_bodyweight_master")
    public String hamstrings_bodyweight_master() {

        return "hamstrings_bodyweight_master";
    }

    @GetMapping(value = "member/hamstrings_bodyweight_master")
    public String Login_hamstrings_bodyweight_master() {

        return "hamstrings_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "hamstrings_machine_master")
    public String hamstrings_machine_master() {

        return "hamstrings_machine_master";
    }

    @GetMapping(value = "member/hamstrings_machine_master")
    public String Login_hamstrings_machine_master() {

        return "hamstrings_machine_master_afterlogin";
    }

    @GetMapping(value = "hamstrings_barbell_master")
    public String hamstrings_barbell_master() {

        return "hamstrings_barbell_master";
    }

    @GetMapping(value = "member/hamstrings_barbell_master")
    public String Login_hamstrings_barbell_master() {

        return "hamstrings_barbell_master_afterlogin";
    }

    @GetMapping(value = "hamstrings_band_master")
    public String hamstrings_band_master() {

        return "hamstrings_band_master";
    }

    @GetMapping(value = "member/hamstrings_band_master")
    public String Login_hamstrings_band_master() {

        return "hamstrings_band_master_afterlogin";
    }

    @GetMapping(value = "hamstrings_stretch_master")
    public String hamstrings_stretch_master() {

        return "hamstrings_stretch_master";
    }

    @GetMapping(value = "member/hamstrings_stretch_master")
    public String Login_hamstrings_stretch_master() {

        return "hamstrings_stretch_master_afterlogin";
    }

    @GetMapping(value = "hamstrings_cable_master")
    public String hamstrings_cable_master() {

        return "hamstrings_cable_master";
    }

    @GetMapping(value = "member/hamstrings_cable_master")
    public String Login_hamstrings_cable_master() {

        return "hamstrings_cable_master_afterlogin";
    }

    @GetMapping(value = "hamstrings_kettlebell_master")
    public String hamstrings_kettlebell_master() {

        return "hamstrings_kettlebell_master";
    }

    @GetMapping(value = "member/hamstrings_kettlebell_master")
    public String Login_hamstrings_kettlebell_master() {

        return "hamstrings_kettlebell_master_afterlogin";
    }
}
