package com.southwind.controller;

import com.southwind.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@Controller
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Autowired
    private RestTemplate restTemplate;
    @ResponseBody
    @RequestMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForObject("http://provider/findAll",Collection.class);
    }
    @ResponseBody
    @RequestMapping("/index")
    public String index() {
        return restTemplate.getForObject("http://provider/index",String.class);
    }
}
