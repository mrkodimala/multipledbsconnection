package com.poc.controller.respository2;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by maredd on 04/07/17.
 */
@Document(collection = "hobbies")
public class Hobbies {

    @Id
    String id;

    String hobby;

    Hobbies(){}

    Hobbies(String hobby){
        this.hobby = hobby;
    }
}
