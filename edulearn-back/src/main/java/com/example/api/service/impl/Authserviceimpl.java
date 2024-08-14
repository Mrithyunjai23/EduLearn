package com.example.api.service.impl;

import lombok.AllArgsConstructor;
import com.example.api.dto.Authdto;
import com.example.api.entity.Auth;
import com.example.api.exception.Resourcenotfoundexception;
import com.example.api.mapper.Authmap;
import com.example.api.repository.Authrepo;
import com.example.api.service.Authservice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class Authserviceimpl implements Authservice {
		
   private Authrepo authrepo;

    @Override
    public Authdto createAuth(Authdto authDto) {

        Auth auth = Authmap.mapToAuth(authDto);
        Auth savedAuth = authrepo.save(auth);
        return Authmap.mapToAuthDto(savedAuth);
    }

    @Override
    public Authdto getAuthById(Long authId) {
        Auth auth = authrepo.findById(authId)
                .orElseThrow(() ->
                        new Resourcenotfoundexception("Employee is not exists with given id : " + authId));

        return Authmap.mapToAuthDto(auth);
    }

    @Override
    public List<Authdto> getAllAuth() {
        List<Auth> auths = authrepo.findAll();
        return auths.stream().map((auth) -> Authmap.mapToAuthDto(auth))
                .collect(Collectors.toList());
    }

    @Override
    public Authdto updateAuth(Long authId, Authdto updatedAuth) {

        Auth auth = authrepo.findById(authId).orElseThrow(
                () -> new Resourcenotfoundexception("Employee is not exists with given id: " + authId)
        );
        auth.setEmail(updatedAuth.getEmail());
        auth.setPassword(updatedAuth.getPassword());
        auth.setConfirmpass(updatedAuth.getConfirmpass());
        auth.setAdmincode(updatedAuth.getAdmincode());
        auth.setAddress(updatedAuth.getAddress());

        Auth updatedAuhtObj = authrepo.save(auth);

        return Authmap.mapToAuthDto(updatedAuhtObj);
    }

    @Override
    public void deleteAuth(Long authId) {

        Auth auth = authrepo.findById(authId).orElseThrow(
                () -> new Resourcenotfoundexception("Employee is not exists with given id: " +authId)
        );

        authrepo.deleteById(authId);
    }
}
