package com.wake.controller;

import com.wake.mapper.UserMapper;
import com.wake.pojo.User;
import com.wake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    //@Autowired
    //private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> show(){
        //List<User> userList = userMapper.queryList();
        userService.delete();
        return null;
    }
}