package com.eureka.consume.consumefirst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/index")
@RestController
public class IndexController {

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
