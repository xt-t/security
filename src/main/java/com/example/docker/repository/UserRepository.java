package com.example.docker.repository;

import com.example.docker.model.UserMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserMongo,String> {
    public UserMongo findByUsername(String username);
}
