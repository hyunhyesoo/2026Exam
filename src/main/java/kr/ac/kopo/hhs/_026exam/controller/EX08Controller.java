package kr.ac.kopo.hhs._026exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EX08Controller {
    @GetMapping("/exam08")
    public ModelAndView requestMethod(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title1", "ModelAndView 연습");
        modelAndView.addObject("title2", "ModelAndView addObject와 setViewName을 사용");
        modelAndView.setViewName("viewPage");
        return modelAndView;
    }
}
