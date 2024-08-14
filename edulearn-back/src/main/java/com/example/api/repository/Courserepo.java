package com.example.api.repository;


import com.example.api.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//course page repository
public interface Courserepo extends JpaRepository<Course, Long> {
}

