package com.project.but.but.controller;

import com.project.but.but.entity.User;
import com.project.but.but.service.Login.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService UserService;

    @GetMapping(value = "/user")
    public List<User> selectAll(){
        List<User> userList = UserService.selectAll();
        return userList;
    }

}
