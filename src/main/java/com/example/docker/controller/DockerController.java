package com.example.docker.controller;

import com.example.docker.model.UserMongo;
import com.example.docker.service.MongoUserDetailsService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/")
public class DockerController {

    @GetMapping()
    public String Hello() {
        return "Hallo";
    }

    }