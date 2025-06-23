package com.example.demo.study;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String main() {
        return "study/main";
    }

    /**
     * 돕다 Basic, Application
     */
    @GetMapping("1")
    public String step1() {
        return "study/concierge";
    }

    /**
     * 반응형 사이즈 확인
     */
    @GetMapping("2")
    public String step2() {
        return "study/rwd";
    }

    /**
     * 반응형 사이트 클론코딩
     */
    @GetMapping("3")
    public String clone() {
        return "study/clone";
    }
}
