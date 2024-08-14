package com.example.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
//parameters
 private String name;
 private String courses;
 private String degree;
 private String year;
 private String institution;

 // Getters and setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getCourses() {
     return courses;
 }

 public void setCourses(String courses) {
     this.courses = courses;
 }

 public String getDegree() {
     return degree;
 }

 public void setDegree(String degree) {
     this.degree = degree;
 }

 public String getYear() {
     return year;
 }

 public void setYear(String year) {
     this.year = year;
 }

 public String getInstitution() {
     return institution;
 }

 public void setInstitution(String institution) {
     this.institution = institution;
 }
}

