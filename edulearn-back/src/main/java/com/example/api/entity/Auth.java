package com.example.api.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Auth")
public class Auth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//parameters
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "confirmpass")
    private String confirmpass;
    

    @Column(name = "admincode")
    private String admincode;
    

    @Column(name = "address")
    private String address;
}
