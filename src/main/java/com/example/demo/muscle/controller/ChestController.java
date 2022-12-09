package com.example.demo.muscle.controller;

import com.example.demo.muscle.service.MuscleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ChestController {

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

    @GetMapping(value = "/chest_dumbell_beginner")
    public String GoTodumbell() {

        return "chest_dumbell_beginner";
        }


    @GetMapping(value = "member/chest_dumbell_beginner")
    public String LoginGoTodumbell() {

        return "chest_dumbell_beginner_afterlogin";
    }

    @GetMapping(value = "chest_bodyweight_beginner")
    public String chest_bodyweight_beginner() {

        return "chest_bodyweight_beginner";
    }

    @GetMapping(value = "member/chest_bodyweight_beginner")
    public String Login_chest_bodyweight_beginner() {

        return "chest_bodyweight_beginner_afterlogin";
    }

    @GetMapping(value = "chest_machine_beginner")
    public String chest_machine_beginner() {

        return "chest_machine_beginner";
    }

    @GetMapping(value = "member/chest_machine_beginner")
    public String Login_chest_machine_beginner() {

        return "chest_machine_beginner_afterlogin";
    }

    @GetMapping(value = "chest_barbell_beginner")
    public String chest_barbell_beginner() {

        return "chest_barbell_beginner";
    }

    @GetMapping(value = "member/chest_barbell_beginner")
    public String Login_chest_barbell_beginner() {

        return "chest_barbell_beginner_afterlogin";
    }

    @GetMapping(value = "chest_band_beginner")
    public String chest_band_beginner() {

        return "chest_band_beginner";
    }

    @GetMapping(value = "member/chest_band_beginner")
    public String Login_chest_band_beginner() {

        return "chest_band_beginner_afterlogin";
    }

    @GetMapping(value = "chest_stretch_beginner")
    public String chest_stretch_beginner() {

        return "chest_stretch_beginner";
    }

    @GetMapping(value = "member/chest_stretch_beginner")
    public String Login_chest_stretch_beginner() {

        return "chest_stretch_beginner_afterlogin";
    }

    @GetMapping(value = "chest_cable_beginner")
    public String chest_cable_beginner() {

        return "chest_cable_beginner";
    }

    @GetMapping(value = "member/chest_cable_beginner")
    public String Login_chest_cable_beginner() {

        return "chest_cable_beginner_afterlogin";
    }

    @GetMapping(value = "chest_kettlebell_beginner")
    public String chest_kettlebell_beginner() {

        return "chest_kettlebell_beginner";
    }

    @GetMapping(value = "member/chest_kettlebell_beginner")
    public String Login_chest_kettlebell_beginner() {

        return "chest_kettlebell_beginner_afterlogin";
    }
}
