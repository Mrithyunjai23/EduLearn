package com.example.api.controller;

import lombok.AllArgsConstructor;
import com.example.api.dto.Authdto;
import com.example.api.service.Authservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000/") 
@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class Authcontrol {

	@Autowired
    private Authservice authService;

    // Build Add Employee REST API
    @PostMapping
    public ResponseEntity<Authdto> createAuth(@RequestBody Authdto authdto){
        Authdto savedAuth = authService.createAuth(authdto);
        return new ResponseEntity<>(savedAuth, HttpStatus.CREATED);
    }

    // Build Get Admin REST API
    @GetMapping("{id}")
    public ResponseEntity<Authdto> getEmployeeById(@PathVariable("id") Long AuthId){
        Authdto authDto = authService.getAuthById(AuthId);
        return ResponseEntity.ok(authDto);
    }

    // Build Get All Employees REST API
    @GetMapping
    public ResponseEntity<List<Authdto>> getAllAuth(){
        List<Authdto> auth = authService.getAllAuth();
        return ResponseEntity.ok(auth);
    }

    // Build Update Employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Authdto> updateAuth(@PathVariable("id") Long authId,@RequestBody Authdto updatedAuth){
          Authdto authDto = authService.updateAuth(authId, updatedAuth);
          return ResponseEntity.ok(authDto);
    }

    // Build Delete Employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAuth(@PathVariable("id") Long AuthId){
        authService.deleteAuth(AuthId);
        return ResponseEntity.ok("Deleted successfully!.");
    }
}