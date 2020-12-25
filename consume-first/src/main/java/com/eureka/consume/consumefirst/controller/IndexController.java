package com.eureka.consume.consumefirst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/index")
@RestController
public class IndexController {

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String home(){
        return "home";
    }
}
