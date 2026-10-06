package kr.ac.kopo.hhs._026exam.controller;

import kr.ac.kopo.hhs._026exam.domain.Member3;
import kr.ac.kopo.hhs._026exam.repository.Member3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/exam14_01")
public class Chap14_01Controller {
    @Autowired
    Member3Repository repository;

    @GetMapping
    public String viewHomePage(Model model){
        Iterable<Member3> memberList =  repository.findAll();
        model.addAttribute("memberList", memberList);
        return "viewPage02";
    }

    @GetMapping("/new")
    public String newInputMember3(Model model){
        Member3 member3 = new Member3();
        model.addAttribute("member", member3);
        return "viewPage02_new";
    }

    @PostMapping("/insert")
    public String insertMember3(@ModelAttribute("member") Member3 member3){
        repository.save(member3);
        return "redirect:/exam14_01";
    }

    @GetMapping("/edit/{id}")
    public String updateInputMethod(@PathVariable(name = "id") int id, Model model){
        Optional<Member3> member3 = repository.findById(id);
        model.addAttribute("member", member3);
        return "viewPage02_edit";
    }

    @PostMapping("/update")
    public String updateMember(@ModelAttribute("member") Member3 member3){
        repository.save(member3);
        return "redirect:/exam14_01";
    }
}
