package com.example.api.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

//not found exception
public class Resourcenotfoundexception extends RuntimeException{

    public Resourcenotfoundexception(String message){
        super(message);
    }
}
