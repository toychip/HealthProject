package com.example.demo.muscle.controller_master;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ChestController_M {

    private MuscleService muscleService;

//    @GetMapping(value = "/dumbell")
//    public String getimages(@RequestParam(value = "muscle")String muscle, @RequestParam(value = "equipment") String equipment, Model model) {
//        List<MuscleResponseVO> muscleResponseList = muscleService.getMuscle(muscle, equipment);
//        model.addAttribute("fourvalue", muscleResponseList);
//        return "dumbell";
//    }
//    @GetMapping(value = "/dumbell")
//    public String getimages(@RequestParam(value = "muscle") String muscle, @RequestParam(value = "equipment") String equipment, Model model) {
//        List<MuscleResponseVO> muscleResponseList = muscleService.getMuscle(muscle, equipment);
//        model.addAttribute("fourvalue", muscleResponseList);
//        return "dumbell";
//    }

    @GetMapping(value = "/chest_dumbell_master")
    public String chest_dumbell_master() {

        return "chest_dumbell_master";
    }


    @GetMapping(value = "member/chest_dumbell_master")
    public String Login_chest_dumbell_master() {

        return "chest_dumbell_master_afterlogin";
    }

    @GetMapping(value = "chest_bodyweight_master")
    public String chest_bodyweight_master() {

        return "chest_bodyweight_master";
    }

    @GetMapping(value = "member/chest_bodyweight_master")
    public String Login_chest_bodyweight_master() {

        return "chest_bodyweight_master_afterlogin";
    }

    @GetMapping(value = "chest_machine_master")
    public String chest_machine_master() {

        return "chest_machine_master";
    }

    @GetMapping(value = "member/chest_machine_master")
    public String Login_chest_machine_master() {

        return "chest_machine_master_afterlogin";
    }

    @GetMapping(value = "chest_barbell_master")
    public String chest_barbell_master() {

        return "chest_barbell_master";
    }

    @GetMapping(value = "member/chest_barbell_master")
    public String Login_chest_barbell_master() {

        return "chest_barbell_master_afterlogin";
    }

    @GetMapping(value = "chest_band_master")
    public String chest_band_master() {

        return "chest_band_master";
    }

    @GetMapping(value = "member/chest_band_master")
    public String Login_chest_band_master() {

        return "chest_band_master_afterlogin";
    }

    @GetMapping(value = "chest_stretch_master")
    public String chest_stretch_master() {

        return "chest_stretch_master";
    }

    @GetMapping(value = "member/chest_stretch_master")
    public String Login_chest_stretch_master() {

        return "chest_stretch_master_afterlogin";
    }

    @GetMapping(value = "chest_cable_master")
    public String chest_cable_master() {

        return "chest_cable_master";
    }

    @GetMapping(value = "member/chest_cable_master")
    public String Login_chest_cable_master() {

        return "chest_cable_master_afterlogin";
    }

    @GetMapping(value = "chest_kettlebell_master")
    public String chest_kettlebell_master() {

        return "chest_kettlebell_master";
    }

    @GetMapping(value = "member/chest_kettlebell_master")
    public String Login_chest_kettlebell_master() {

        return "chest_kettlebell_master_afterlogin";
    }
}
