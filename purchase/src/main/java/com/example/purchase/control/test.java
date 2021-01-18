package com.example.purchase.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("purchase/test")
    public String testJenkinsWithSpringboot() {
        return "jenkins with springboot1腌腌";
    }
}
