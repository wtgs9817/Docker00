package com.example.example01.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(Model model) {

        model.addAttribute("message", "Spring Boot 테스트");
        System.out.println("테스트중");
        return "test01";
    }


}
