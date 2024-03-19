package com.wake.controller;


import com.wake.mapper.UserMapper;
import com.wake.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("show")
    public List<User> show(){
        List<User> userList =  userMapper.selectAll();
        return userList;
    }
}