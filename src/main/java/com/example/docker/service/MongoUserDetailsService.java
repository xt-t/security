package com.example.docker.service;

import com.example.docker.model.UserMongo;
import com.example.docker.repository.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
    public class MongoUserDetailsService implements UserDetailsService {
        private final UserRepository repository;

        public MongoUserDetailsService(UserRepository repository) {
            this.repository = repository;
        }

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            UserMongo user = repository.findByUsername(username);
            if(user == null) {
                throw new UsernameNotFoundException("User not found");
            }
            return new User(user.getUsername(), user.getPassword(),
                    List.of(new SimpleGrantedAuthority("user")));
        }
    }
