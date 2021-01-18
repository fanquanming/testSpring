package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.servicesimpl.StudentServicesImpl;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller

public class StudentController {
    @Value("${server.port}")
    private String port;
    @Autowired
    private StudentServicesImpl studentServices;
    @RequestMapping("/findAll")
    @ResponseBody
    public Collection<Student> findAll() {
        return studentServices.findAll();
    }
    @RequestMapping("/findbyid/{id}")
    @ResponseBody
    public Student findById(@PathVariable("id") long id) {
        return studentServices.findById(id);
    }
    @RequestMapping("/save")
    @ResponseBody
    public void save(@RequestBody Student student) {
        studentServices.save(student);
    }
    @RequestMapping("/deletebyid/{id}")
    public void deleteById(@PathVariable("id") long id)
    {
        studentServices.deleteById(id);
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "当前端口" + this.port;
    }
}
