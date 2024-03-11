package com.wake.controller;

import com.wake.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Doug
 * @Date: 2024-03-11 21:08
 * @Description:
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    private User user;

    @GetMapping("show")
    public User show(){
        return user;
    }
}