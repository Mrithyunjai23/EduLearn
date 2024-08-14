package com.example.api.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import com.example.api.entity.Achiever;
import com.example.api.repository.Topachrepo;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/api/topach")
public class Topachcontroller {
    @Autowired
    private Topachrepo achieverRepository;
//build to get the top achievers details
    @GetMapping("/top")
    public List<Achiever> getTopAchievers() {
        return achieverRepository.findAll(); // Modify as needed to return top achievers
    }
}

