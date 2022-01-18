package com.example.docker.controller;

import com.example.docker.service.MongoUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

public class PrincipalController {

//    @GetMapping
//    String getHallo(Principal principal) {
//        final UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
//        final boolean isAllowed =
//                userDetails.getAuthorities().stream()
//                        .anyMatch(g -> MongoUserDetailsService.AUTHORITY_API_READWRITE.equals(g.getAuthority()));
////        for (GrantedAuthority g : userDetails.getAuthorities()) {
////            if (MongoUserDetailsService.AUTHORITY_API_READWRITE.equals(g.getAuthority())) {
////                isAllowed = true;
////                break;
////            }
////        }
//        if (isAllowed) {
//            return "Hallo API " + principal.getName();
//        } else {
//            return "Darfst du nicht";
//        }
//    }
}
