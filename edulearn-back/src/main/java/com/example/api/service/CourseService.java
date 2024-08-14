package com.example.api.service;


import com.example.api.entity.Course;
import com.example.api.repository.Courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

 @Autowired
 private Courserepo courseRepository;
//fetching 
 public List<Course> getAllCourses() {
     return courseRepository.findAll();
 }
}

