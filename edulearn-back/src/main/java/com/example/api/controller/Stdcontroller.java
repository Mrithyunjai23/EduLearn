package com.example.api.controller;


import com.example.api.entity.Student;
import com.example.api.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/api/students")
public class Stdcontroller {
 @Autowired
 private Studentservice studentService;
//build to get the courses deatils from the db
 @GetMapping
 public List<Student> getAllStudents() {
     return studentService.getAllStudents();
 }

 @DeleteMapping("/del/{id}")
 public void deleteStudent(@PathVariable Long id) {
     studentService.deleteStudent(id);
 }
}
