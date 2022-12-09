package com.example.demo.muscle.controller_master;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class QuadsController_M {

    private MuscleService muscleService;

    @GetMapping(value = "/quads_dumbell_master")
    public String quads_dumbell_master() {

        return "quads_dumbell_master";
    }


    @GetMapping(value = "member/quads_dumbell_master")
    public String Login_quads_dumbell_master() {

        return "quads_dumbell_master_afterlogin";
    }

    @GetMapping(value = "quads_bodyweight_master")
    public String quads_bodyweight_master() {

        return "quads_bodyweight_master";
    }

    @GetMapping(value = "member/quads_bodyweight_master")
    public String Login_quads_bodyweight_master() {

        return "quads_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "quads_machine_master")
    public String quads_machine_master() {

        return "quads_machine_master";
    }

    @GetMapping(value = "member/quads_machine_master")
    public String Login_quads_machine_master() {

        return "quads_machine_master_afterlogin";
    }

    @GetMapping(value = "quads_barbell_master")
    public String quads_barbell_master() {

        return "quads_barbell_master";
    }

    @GetMapping(value = "member/quads_barbell_master")
    public String Login_quads_barbell_master() {

        return "quads_barbell_master_afterlogin";
    }

    @GetMapping(value = "quads_band_master")
    public String quads_band_master() {

        return "quads_band_master";
    }

    @GetMapping(value = "member/quads_band_master")
    public String Login_quads_band_master() {

        return "quads_band_master_afterlogin";
    }

    @GetMapping(value = "quads_stretch_master")
    public String quads_stretch_master() {

        return "quads_stretch_master";
    }

    @GetMapping(value = "member/quads_stretch_master")
    public String Login_quads_stretch_master() {

        return "quads_stretch_master_afterlogin";
    }

    @GetMapping(value = "quads_cable_master")
    public String quads_cable_master() {

        return "quads_cable_master";
    }

    @GetMapping(value = "member/quads_cable_master")
    public String Login_quads_cable_master() {

        return "quads_cable_master_afterlogin";
    }

    @GetMapping(value = "quads_kettlebell_master")
    public String quads_kettlebell_master() {

        return "quads_kettlebell_master";
    }

    @GetMapping(value = "member/quads_kettlebell_master")
    public String Login_quads_kettlebell_master() {

        return "quads_kettlebell_master_afterlogin";
    }
}
