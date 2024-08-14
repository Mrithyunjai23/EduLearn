package com.example.api.repository;
import com.example.api.entity.Topins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
// top achievers page repository
public interface Topinsrepo extends JpaRepository<Topins, Long> {
}
