package com.example.api.repository;

//Signin and signup
import com.example.api.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Authrepo extends JpaRepository<Auth, Long> {
}
