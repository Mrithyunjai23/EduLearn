package com.example.api.repository;

import com.example.api.entity.Institution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
//institution page repository
public interface Insrepo extends JpaRepository<Institution, Long> {
}

