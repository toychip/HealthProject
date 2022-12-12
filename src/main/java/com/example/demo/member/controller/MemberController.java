package com.example.demo.member.controller;


import com.example.demo.member.dto.MemberDTO;
import com.example.demo.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    // 회원가입 페이지 출력 요청
    @GetMapping("/member/signup")
    public String saveForm() {
        return "signup";
    }

    @PostMapping("/member/signup")
    public String save(@ModelAttribute MemberDTO memberDTO) {
//        System.out.println("MemberController.save");
//        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "signin";
    }

    @GetMapping("/member/signin")
    public String loginForm() {
        return "signin";
    }

    @PostMapping("/member/signin")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {
        MemberDTO loginResult = memberService.login(memberDTO);
        if (loginResult != null) {
            // login 성공
            session.setAttribute("loginUsername", loginResult.getUsername());
            session.setAttribute("loginNickname", loginResult.getNickname());
            session.setAttribute("memberBenchpress", loginResult.getBenchpress());
            session.setAttribute("memberDeadlift", loginResult.getDeadlift());
            session.setAttribute("memberSquat", loginResult.getSquat());
            session.setAttribute("memberBigthree", loginResult.getBigthree());

            return "beginner-main-afterlogin";
        } else {
            // login 실패
            return "signin";
        }
    }

    @GetMapping("/member/rank-whole")
    public String findAll(Model model) {
        List<MemberDTO> memberDTOList = memberService.findAll();
        // 어떠한 html로 가져갈 데이터가 있다면 model사용
        model.addAttribute("memberList", memberDTOList);
        return "rank-whole";

    }

    @GetMapping("/board/rank-whole")
    public String findAlll(Model model) {
        List<MemberDTO> memberDTOList = memberService.findAll();
        // 어떠한 html로 가져갈 데이터가 있다면 model사용
        model.addAttribute("memberList", memberDTOList);
        return "rank-whole";

    }




    @GetMapping("/member/{id}")
    public String findById(@PathVariable Long id, Model model) {
        MemberDTO memberDTO = memberService.findById(id);
        List<MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute("memberList", memberDTOList);
        model.addAttribute("member", memberDTO);


        return "mypage";
    }

    @GetMapping("/member/update")
    public String updateForm(HttpSession session, Model model) {
        String myUsername = (String) session.getAttribute("loginUsername");
        MemberDTO memberDTO = memberService.updateForm(myUsername);
        model.addAttribute("updateMember", memberDTO);
        return "member_update";
    }

    @PostMapping("/member/update")
    public String update(@ModelAttribute MemberDTO memberDTO) {
        memberService.update(memberDTO);
        return "redirect:/member/" + memberDTO.getId();
    }

    @GetMapping("/member/delete/{id}")
    public String deleteById(@PathVariable Long id) {
        memberService.deleteById(id);
        return "redirect:/member/";
    }

    @GetMapping("/member/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

}