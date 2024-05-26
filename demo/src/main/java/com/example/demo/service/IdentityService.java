package com.example.demo.service;



import com.example.demo.model.Identity;
import com.example.demo.repository.IdentityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentityService {
    @Autowired
    private IdentityRepository identityRepository;

    public List<Identity> getAllIdentities() {
        return identityRepository.findAll();
    }

    public Identity getIdentityById(Long id) {
        return identityRepository.findById(id).orElse(null);
    }

    public Identity createIdentity(Identity identity) {
        return identityRepository.save(identity);
    }

    public void deleteIdentity(Long id) {
        identityRepository.deleteById(id);
    }
}

