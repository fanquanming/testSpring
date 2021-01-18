package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    private FeignProviderClient feignProviderClient;
    @GetMapping("/findAll")
    @ResponseBody
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }
    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return feignProviderClient.index();
    }
}
