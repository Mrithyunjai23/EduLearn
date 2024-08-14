package com.example.api.service;

import com.example.api.dto.Authdto;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface Authservice {
	//creating
    Authdto createAuth(Authdto authdto);
//fetching single row
   Authdto getAuthById(Long authId);
//fetching all the rows
    List<Authdto> getAllAuth();
//updating 
    Authdto updateAuth(Long auhtId, Authdto updatedAuth);
//deleting by id
    void deleteAuth(Long authId);
}
