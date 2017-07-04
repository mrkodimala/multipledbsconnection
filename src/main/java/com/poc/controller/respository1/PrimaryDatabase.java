package com.poc.controller.respository1;

import com.poc.controller.respository1.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PrimaryDatabase {

    @Autowired
    UsersRepository usersRepository;

    @RequestMapping(value = "/primary", method = RequestMethod.POST)
    public @ResponseBody
    String storeValuestoDB1(@RequestBody Map<String,Object> body){
        String name = body.get("name").toString();
        Users user = new Users(name);
        usersRepository.save(user);
        return "Data Stored Successfully";
    }

}
