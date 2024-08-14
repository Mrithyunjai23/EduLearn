package com.example.api.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import com.example.api.entity.Topins;
import com.example.api.repository.Topinsrepo;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/api/topins")
public class Topinscontroller {
    @Autowired
    private Topinsrepo institutionRepository;
////build to get the top institutions details
    @GetMapping("/top")
    public List<Topins> getTopInstitutions() {
        return institutionRepository.findAll(); // Modify as needed to return top institutions
    }
}

