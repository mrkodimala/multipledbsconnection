package com.poc.controller.respository2;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by maredd on 04/07/17.
 */

@Repository
public interface HobbiesRespository  extends MongoRepository<Hobbies,String>{
}
