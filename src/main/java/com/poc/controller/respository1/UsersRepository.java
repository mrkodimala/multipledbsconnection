package com.poc.controller.respository1;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by maredd on 04/07/17.
 */
@Repository
public interface UsersRepository extends MongoRepository<Users,String> {
    /**
     * Created by maredd on 04/07/17.
     */
}
