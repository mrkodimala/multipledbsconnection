package com.poc.controller.respository1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by maredd on 04/07/17.
 */
@Document(collection = "users")
class Users {

    @Id
    String id;

    String username;

    Users(){}

    Users(String name){
        this.username = name;
    }

}
