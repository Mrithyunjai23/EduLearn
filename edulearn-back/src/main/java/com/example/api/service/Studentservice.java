package com.example.api.service;


import com.example.api.entity.Student;
import com.example.api.repository.Stdrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {
 @Autowired
 private Stdrepo studentRepository;
//fetching the all students details
 public List<Student> getAllStudents() {
     return studentRepository.findAll();
 }
//delete the students by id
 public void deleteStudent(Long id) {
     studentRepository.deleteById(id);
 }
}

