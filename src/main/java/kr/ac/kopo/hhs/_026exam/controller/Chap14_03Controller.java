package kr.ac.kopo.hhs._026exam.controller;

import kr.ac.kopo.hhs._026exam.domain.Detail;
import kr.ac.kopo.hhs._026exam.domain.Member3;
import kr.ac.kopo.hhs._026exam.domain.Product2;
import kr.ac.kopo.hhs._026exam.repository.DetailRepository;
import kr.ac.kopo.hhs._026exam.repository.Member3Repository2;
import kr.ac.kopo.hhs._026exam.repository.Product2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/exam14_03")
public class Chap14_03Controller {
    @Autowired
    private Product2Repository product2Repository;

    @Autowired
    private DetailRepository detailRepository;

    @GetMapping
    public String requestInsert(Model model){
        Product2 product2 = new Product2();
        Detail detail = new Detail();

        product2.setName("아이폰 듀오");
        product2.setPrice(3500000);

        detail.setDescription("아이폰 최초 폴더폰");
        detail.setWeight(300);
        detail.setWidth(124.5f);
        detail.setHeight(132.7f);
        product2.setDetail(detail);

        product2Repository.save(product2);
        detailRepository.save(detail);

        Iterable<Product2> product2List = product2Repository.findAll();
        Iterable<Detail> detailList = detailRepository.findAll();

        model.addAttribute("product2List", product2List);
        model.addAttribute("detail", detailList);
        return "viewPage04";
    }
}
