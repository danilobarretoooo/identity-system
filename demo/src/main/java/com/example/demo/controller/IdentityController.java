package com.example.demo.controller;



import com.example.demo.model.Identity;
import com.example.demo.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/identities")
public class IdentityController {
    @Autowired
    private IdentityService identityService;

    @GetMapping
    public List<Identity> getAllIdentities() {
        return identityService.getAllIdentities();
    }

    @GetMapping("/{id}")
    public Identity getIdentityById(@PathVariable Long id) {
        return identityService.getIdentityById(id);
    }

    @PostMapping
    public Identity createIdentity(@RequestBody Identity identity) {
        return identityService.createIdentity(identity);
    }

    @DeleteMapping("/{id}")
    public void deleteIdentity(@PathVariable Long id) {
        identityService.deleteIdentity(id);
    }
}

