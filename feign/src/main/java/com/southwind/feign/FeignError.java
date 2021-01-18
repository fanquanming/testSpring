package com.southwind.feign;

import com.southwind.entity.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        List list = new ArrayList();
        Student student = new Student();
        student.setAge(18);
        student.setName("范泉明");
        student.setId(123411);
        list.add(student);
        return list;
    }

    @Override
    public String index() {
        return "服务器维护中。。。。";
    }
}
