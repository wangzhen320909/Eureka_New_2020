package com.eureka.consume.consumefirst.controller;

import com.eureka.consume.consumefirst.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getUserTest/{id}")
    public User getUserTest(@PathVariable String id){
        User user = new User();
        user.setAge("12");
        user.setId(id);
        user.setName("Wzg");
        user.setSex("man");
        return user;
    }
}
