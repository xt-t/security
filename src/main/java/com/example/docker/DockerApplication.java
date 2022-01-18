package com.example.docker;

import com.example.docker.model.UserMongo;
import com.example.docker.repository.UserRepository;
import com.mongodb.DuplicateKeyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class DockerApplication implements CommandLineRunner {

    public static void main(String[] args)
    {
        SpringApplication.run(DockerApplication.class, args);
    }

    @Autowired
    UserRepository repository;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public void run(String... args) throws Exception {
        final String encodedPassword = encoder.encode("123");

        final UserMongo user = UserMongo.newUser("test", encodedPassword, List.of(new SimpleGrantedAuthority(API_READWRITE)));
        try {
            repository.insert(user);
        }
        catch (DuplicateKeyException e) {
            LOG.info("User '" + user.getUsername() + "' already exists.");
        }
    }

}

