package com.example.api.repository;


import com.example.api.entity.Mycourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// my course  page repository
@Repository
public interface Mycourserepo extends JpaRepository<Mycourse, Long> {
}

