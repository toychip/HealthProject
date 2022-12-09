package com.example.demo.muscle.controller_master;


import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class GlutesController_M {

    private MuscleService muscleService;

    @GetMapping(value = "/glutes_dumbell_master")
    public String glutes_dumbell_master() {

        return "glutes_dumbell_master";
    }


    @GetMapping(value = "member/glutes_dumbell_master")
    public String Login_glutes_dumbell_master() {

        return "glutes_dumbell_master_afterlogin";
    }

    @GetMapping(value = "glutes_bodyweight_master")
    public String glutes_bodyweight_master() {

        return "glutes_bodyweight_master";
    }

    @GetMapping(value = "member/glutes_bodyweight_master")
    public String Login_glutes_bodyweight_master() {

        return "glutes_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "glutes_machine_master")
    public String glutes_machine_master() {

        return "glutes_machine_master";
    }

    @GetMapping(value = "member/glutes_machine_master")
    public String Login_glutes_machine_master() {

        return "glutes_machine_master_afterlogin";
    }

    @GetMapping(value = "glutes_barbell_master")
    public String glutes_barbell_master() {

        return "glutes_barbell_master";
    }

    @GetMapping(value = "member/glutes_barbell_master")
    public String Login_glutes_barbell_master() {

        return "glutes_barbell_master_afterlogin";
    }

    @GetMapping(value = "glutes_band_master")
    public String glutes_band_master() {

        return "glutes_band_master";
    }

    @GetMapping(value = "member/glutes_band_master")
    public String Login_glutes_band_master() {

        return "glutes_band_master_afterlogin";
    }

    @GetMapping(value = "glutes_stretch_master")
    public String glutes_stretch_master() {

        return "glutes_stretch_master";
    }

    @GetMapping(value = "member/glutes_stretch_master")
    public String Login_glutes_stretch_master() {

        return "glutes_stretch_master_afterlogin";
    }

    @GetMapping(value = "glutes_cable_master")
    public String glutes_cable_master() {

        return "glutes_cable_master";
    }

    @GetMapping(value = "member/glutes_cable_master")
    public String Login_glutes_cable_master() {

        return "glutes_cable_master_afterlogin";
    }

    @GetMapping(value = "glutes_kettlebell_master")
    public String glutes_kettlebell_master() {

        return "glutes_kettlebell_master";
    }

    @GetMapping(value = "member/glutes_kettlebell_master")
    public String Login_glutes_kettlebell_master() {

        return "glutes_kettlebell_master_afterlogin";
    }
}
