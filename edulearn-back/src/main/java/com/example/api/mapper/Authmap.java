package com.example.api.mapper;


import com.example.api.dto.Authdto;
import com.example.api.entity.Auth;

public class Authmap {
//sending the parameters to the service
    public static Authdto mapToAuthDto(Auth auth){
        return new Authdto(
                auth.getId(),
                auth.getEmail(),
                auth.getPassword(),
                auth.getConfirmpass(),
                auth.getAdmincode(),
                auth.getAddress()
        );
    }

    public static Auth mapToAuth(Authdto authdto){
        return new Auth(
                authdto.getId(),
                authdto.getEmail(),
                authdto.getPassword(),
                authdto.getConfirmpass(),
                authdto.getAdmincode(),
                authdto.getAddress()
        );
    }
}