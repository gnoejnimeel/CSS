package com.example.demo.study;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String main() {
        return "study/main";
    }

    @GetMapping("1")
    public String step1() {
        return "study/1";
    }
}
