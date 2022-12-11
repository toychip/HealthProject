package com.example.demo.homepage.Controller;

import com.example.demo.muscle.service.MuscleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {


    private MuscleService muscleService;

    @GetMapping(value = "board/beginner-main")
    public String Login_beginnermain_to_board(){
        return "beginner-main-afterlogin";
    }

    @GetMapping(value = "board/mypage")
    public String Login_board_to_mypage(){
        return "mypage";
    }


    @GetMapping(value = "board/chest_dumbell_beginner")
    public String Login_board_to_chest_dumbell_beginner(){
        return "chest_dumbell_beginner_afterlogin";
    }


    @GetMapping(value = "/member/master-main")
    public String MasterGoMain() {
        return "/master-main-afterlogin";
    }

//    @GetMapping("/member/master-main-afterlogin")
//    public String login_after_master_main() {
//        return "master-main-afterlogin";
//    }

    @GetMapping(value = "/member/beginner-main")
    public String BeginnerGoMain() {
        return "/beginner-main-afterlogin";
    }

    @GetMapping("/member/beginner-main-afterlogin")
    public String login_after_Beginner_main() {
        return "/beginner-main-afterlogin";
    }


    @GetMapping("/member/master-main-afterlogin")
    public String login_after_Master_main() {
        return "/master-main-afterlogin";
    }

    @GetMapping("/board/master-main-afterlogin")
    public String Board_after_Master_main() {
        return "/master-main-afterlogin";
    }

    @GetMapping("/board/beginner-main-afterlogin")
    public String Board_after_beginner_main() {
        return "/beginner-main-afterlogin";
    }

    @GetMapping("/member/mypage")
    public String login_after_mypage() {
        return "mypage";
    }

    @GetMapping("/member/record")
    public String login_member_record() {
        return "record";
    }


    @GetMapping("/member/routine-time")
    public String routine_time() {
        return "routine-muscle";
    }

    @GetMapping("/member/routine-division")
    public String routine_divsion() {
        return "routine-division";
    }

    @GetMapping("/member/routine-muscle")
    public String routine_muscle() {
        return "routine-time";
    }


}

