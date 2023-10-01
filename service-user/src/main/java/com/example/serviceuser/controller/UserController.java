package com.example.serviceuser.controller;

import com.example.commons.entity.User;
import com.example.serviceuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/{uid}")
    public User getUserById(@PathVariable("uid") int uid) {
        return userService.getUserById(uid);
    }
}
