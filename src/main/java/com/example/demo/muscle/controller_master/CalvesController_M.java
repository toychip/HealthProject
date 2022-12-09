package com.example.demo.muscle.controller_master;


import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CalvesController_M {

    private MuscleService muscleService;


    @GetMapping(value = "/calves_dumbell_master")
    public String calves_dumbell_master() {

        return "calves_dumbell_master";
    }


    @GetMapping(value = "member/calves_dumbell_master")
    public String Login_calves_dumbell_master() {

        return "calves_dumbell_master_afterlogin";
    }

    @GetMapping(value = "calves_bodyweight_master")
    public String calves_bodyweight_master() {

        return "calves_bodyweight_master";
    }

    @GetMapping(value = "member/calves_bodyweight_master")
    public String Login_calves_bodyweight_master() {

        return "calves_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "calves_machine_master")
    public String calves_machine_master() {

        return "calves_machine_master";
    }

    @GetMapping(value = "member/calves_machine_master")
    public String Login_calves_machine_master() {

        return "calves_machine_master_afterlogin";
    }

    @GetMapping(value = "calves_barbell_master")
    public String calves_barbell_master() {

        return "calves_barbell_master";
    }

    @GetMapping(value = "member/calves_barbell_master")
    public String Login_calves_barbell_master() {

        return "calves_barbell_master_afterlogin";
    }

    @GetMapping(value = "calves_band_master")
    public String calves_band_master() {

        return "calves_band_master";
    }

    @GetMapping(value = "member/calves_band_master")
    public String Login_calves_band_master() {

        return "calves_band_master_afterlogin";
    }

    @GetMapping(value = "calves_stretch_master")
    public String calves_stretch_master() {

        return "calves_stretch_master";
    }

    @GetMapping(value = "member/calves_stretch_master")
    public String Login_calves_stretch_master() {

        return "calves_stretch_master_afterlogin";
    }

    @GetMapping(value = "calves_cable_master")
    public String calves_cable_master() {

        return "calves_cable_master";
    }

    @GetMapping(value = "member/calves_cable_master")
    public String Login_calves_cable_master() {

        return "calves_cable_master_afterlogin";
    }

    @GetMapping(value = "calves_kettlebell_master")
    public String calves_kettlebell_master() {

        return "calves_kettlebell_master";
    }

    @GetMapping(value = "member/calves_kettlebell_master")
    public String Login_calves_kettlebell_master() {

        return "calves_kettlebell_master_afterlogin";
    }
}
