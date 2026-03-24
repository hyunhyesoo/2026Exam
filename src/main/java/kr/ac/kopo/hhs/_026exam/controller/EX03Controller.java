package kr.ac.kopo.hhs._026exam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.web.bind.annotation.RestController
public class EX02Controller {
    @RequestMapping(value = "/exam02", method = RequestMethod.GET)
    public String requestMethod(){
        return "<h1>@RestController 연습 중<h1>";
    }
}
