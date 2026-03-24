package kr.ac.kopo.hhs._026exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EX06Controller {
//    @GetMapping("/exam06")
//    public String requestMethod(Model model){
//        model.addAttribute("title1", "Model 유형 연습1");
//        model.addAttribute("title2", "문자열 값 또는 객체 참조 값 전달 가능");
//        return "viewPage";
//    }

    @GetMapping("/exam06")
    public String requestMethod(Model model){
        model.addAttribute("title1", "Model 유형 연습1");
        model.addAttribute("title2", "문자열 값 또는 객체 참조 값 전달 가능");
        return "view06";
    }
}
