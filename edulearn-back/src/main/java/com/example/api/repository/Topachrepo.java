package com.example.api.repository;
import com.example.api.entity.Achiever;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
//Top ins page repository
public interface Topachrepo extends JpaRepository<Achiever, Long> {
}

