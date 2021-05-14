package com.example.springbootsample.service;

import com.example.springbootsample.model.Student;
import com.example.springbootsample.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {

    @Autowired
    private StudentRepo studentRepo;
    public Student addStudent(Student student){

        studentRepo.save(student);
        return student;

    }
    public List<Student> getAllDetails(){
        List<Student> student=studentRepo.findAll();

        return student;
    }
}
