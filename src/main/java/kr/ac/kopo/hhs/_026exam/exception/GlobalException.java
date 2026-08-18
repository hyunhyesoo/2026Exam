package kr.ac.kopo.hhs._026exam.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//전역 Exception 처리가 필요할 때 사용
@ControllerAdvice(basePackages = {"kr.ac.kopo.hhs"})
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public String handlerException(Exception ex, Model model){
        model.addAttribute("data1", "GlobalException 처리 메시지입니다.");
        model.addAttribute("data2", ex);
        return "viewPage11_01";
    }
}
