package com.example.demo.muscle.controller_master;


import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ForearmsController_M {

    private MuscleService muscleService;

    @GetMapping(value = "/forearms_dumbell_master")
    public String forearms_dumbell_master() {

        return "forearms_dumbell_master";
    }


    @GetMapping(value = "member/forearms_dumbell_master")
    public String Login_forearms_dumbell_master() {

        return "forearms_dumbell_master_afterlogin";
    }

    @GetMapping(value = "forearms_bodyweight_master")
    public String forearms_bodyweight_master() {

        return "forearms_bodyweight_master";
    }

    @GetMapping(value = "member/forearms_bodyweight_master")
    public String Login_forearms_bodyweight_master() {

        return "forearms_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "forearms_machine_master")
    public String forearms_machine_master() {

        return "forearms_machine_master";
    }

    @GetMapping(value = "member/forearms_machine_master")
    public String Login_forearms_machine_master() {

        return "forearms_machine_master_afterlogin";
    }

    @GetMapping(value = "forearms_barbell_master")
    public String forearms_barbell_master() {

        return "forearms_barbell_master";
    }

    @GetMapping(value = "member/forearms_barbell_master")
    public String Login_forearms_barbell_master() {

        return "forearms_barbell_master_afterlogin";
    }

    @GetMapping(value = "forearms_band_master")
    public String forearms_band_master() {

        return "forearms_band_master";
    }

    @GetMapping(value = "member/forearms_band_master")
    public String Login_forearms_band_master() {

        return "forearms_band_master_afterlogin";
    }

    @GetMapping(value = "forearms_stretch_master")
    public String forearms_stretch_master() {

        return "forearms_stretch_master";
    }

    @GetMapping(value = "member/forearms_stretch_master")
    public String Login_forearms_stretch_master() {

        return "forearms_stretch_master_afterlogin";
    }

    @GetMapping(value = "forearms_cable_master")
    public String forearms_cable_master() {

        return "forearms_cable_master";
    }

    @GetMapping(value = "member/forearms_cable_master")
    public String Login_forearms_cable_master() {

        return "forearms_cable_master_afterlogin";
    }

    @GetMapping(value = "forearms_kettlebell_master")
    public String forearms_kettlebell_master() {

        return "forearms_kettlebell_master";
    }

    @GetMapping(value = "member/forearms_kettlebell_master")
    public String Login_forearms_kettlebell_master() {

        return "forearms_kettlebell_master_afterlogin";
    }
}
