package com.southwind.services;

import com.southwind.entity.Student;

import java.util.Collection;

public interface StudentServices {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void save(Student student);
    public void deleteById(long id);
}
