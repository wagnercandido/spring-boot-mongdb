package com.javacourse.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javacourse.mongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
