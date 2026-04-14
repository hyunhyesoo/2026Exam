package kr.ac.kopo.hhs._026exam.controller;

import kr.ac.kopo.hhs._026exam.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EX09Controller {
    @GetMapping("/member")
    public String requestForm(){
        return "signUp";
    }

    @PostMapping("/member") //아래에 @ModelAttribute는 생략 가능함
    public String requestFormResult(@ModelAttribute Member member, Model model){
//        model.addAttribute("member", member); //여기도 생략 가능
        return "signUpResult";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
//        binder.setAllowedFields("id", "city", "hobby");
        binder.setDisallowedFields("city", "hobby");
    }
}
