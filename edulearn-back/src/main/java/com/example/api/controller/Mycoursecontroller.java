package com.example.api.controller;


import com.example.api.entity.Mycourse;
import com.example.api.repository.Mycourserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/api/my")
public class Mycoursecontroller {

    @Autowired
    private Mycourserepo courseRepository;
//build to get the courses in std section
    @GetMapping
    public List<Mycourse> getAllCourses() {
        return courseRepository.findAll();
    }
}

