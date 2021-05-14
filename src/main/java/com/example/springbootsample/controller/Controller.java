package com.example.springbootsample.controller;

import com.example.springbootsample.model.Student;
import com.example.springbootsample.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("/studentpost")
    public Student addDetails(@RequestBody Student student){
        service.addStudent(student);
        return student;
    }

    @GetMapping("/getStudent")
    public List<Student> getAllDetails(){
        List<Student> student=service.getAllDetails();

        return student;
    }

    @GetMapping("/getOpenshift")
    public String getOpen(){

        return "Success";
    }
}
