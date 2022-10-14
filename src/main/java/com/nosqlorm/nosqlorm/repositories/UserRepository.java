package com.nosqlorm.nosqlorm.repositories;

import com.nosqlorm.nosqlorm.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {


}
