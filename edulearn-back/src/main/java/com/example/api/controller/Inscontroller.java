package com.example.api.controller;

import com.example.api.entity.Institution;
import com.example.api.repository.Insrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/api/ins")
public class Inscontroller {
    @Autowired
    private Insrepo institutionRepository;
//Build to get the institution details
    @GetMapping
    public List<Institution> getAllInstitutions() {
        return institutionRepository.findAll();
    }
//deleting the data by id
    @DeleteMapping("/del/{id}")
    public void deleteInstitution(@PathVariable Long id) {
        institutionRepository.deleteById(id);
    }
}
