package com.example.api.repository;


import com.example.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//student page repository
public interface Stdrepo extends JpaRepository<Student, Long> {
}
