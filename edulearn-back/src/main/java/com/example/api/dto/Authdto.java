package com.example.api.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Authdto {

    private Long id;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("confirmpass")
    private String confirmpass;
    
    @JsonProperty("admincode")
    private String admincode;
    
    @JsonProperty("address")
    private String address;
}