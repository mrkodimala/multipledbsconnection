package com.poc.controller.respository2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by maredd on 04/07/17.
 */

@Controller
public class SecondaryDatabase {

    @Autowired
    HobbiesRespository hobbiesRespository;

    @RequestMapping(value = "/secondary", method = RequestMethod.POST)
    public @ResponseBody
    String storeHobby(@RequestBody Map<String,Object> body){
        String hobby = body.get("hobby").toString();
        Hobbies hobbies = new Hobbies(hobby);
        hobbiesRespository.save(hobbies);
        return "Hobby Stored Successfully";
    }
}
