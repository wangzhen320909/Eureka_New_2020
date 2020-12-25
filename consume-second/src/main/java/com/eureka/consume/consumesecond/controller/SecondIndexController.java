package com.eureka.consume.consumesecond.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class SecondIndexController {

    @RequestMapping("/home")
    public String home(){
        return "Second home";
    }
}
