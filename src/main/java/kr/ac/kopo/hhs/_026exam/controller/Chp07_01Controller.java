package kr.ac.kopo.hhs._026exam.controller;

import kr.ac.kopo.hhs._026exam.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/chap07")
public class Chp07_01Controller {
    @GetMapping("/form")
    public String requestForm(){
        return "viewFilePage";
    }

    @PostMapping("/form")
    public String requestFileUploadResult(@ModelAttribute Member member, Model model){
//    public String requestFileUploadResult(@RequestParam("name")String name, @RequestParam("fileImage")MultipartFile file, Model model){
//    public String requestFileUploadResult(MultipartHttpServletRequest request, Model model){
//        String name = request.getParameter("name");
//        MultipartFile file = request.getFile("fileImage"); //전송받은 파일
        String name = member.getName();
        MultipartFile file = member.getFileImage();

        String originFileName = file.getOriginalFilename();
        File saveFile = new File("d:\\upload\\" + name + "_" + originFileName); //내 컴퓨터에 저장할 파일

        try {
            file.transferTo(saveFile); //전송받은 파일을 내 컴퓨터에 저장
            model.addAttribute("title", "파일 업로드 결과 페이지");
            model.addAttribute("originFileName", originFileName);
            model.addAttribute("saveFileName", saveFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "viewFilePageResult";
    }
}
