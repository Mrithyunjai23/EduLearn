package com.example.api.controller;


import com.example.api.entity.Course;
import com.example.api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class CourseController {

 @Autowired
 private CourseService courseService;
//Build get the courses
 @GetMapping("/api/courses")
 public List<Course> getCourses() {
     return courseService.getAllCourses();
 }
}

