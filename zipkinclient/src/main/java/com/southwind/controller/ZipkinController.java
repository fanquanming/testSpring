package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/zipkin")
public class ZipkinController {
    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return this.port;
    }

}
