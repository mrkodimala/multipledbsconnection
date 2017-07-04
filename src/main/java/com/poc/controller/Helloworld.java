package com.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by maredd on 03/07/17.
 */
@Controller
public class Helloworld {

    @RequestMapping(value = "/hello")
    public @ResponseBody
    String returnHelloWorld(){
        return "Hello World";
    }

}
