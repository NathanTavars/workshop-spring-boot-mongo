package com.nathantavares.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nathantavares.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
