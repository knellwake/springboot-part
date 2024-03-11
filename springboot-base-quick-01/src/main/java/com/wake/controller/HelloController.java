package com.wake.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Doug
 * @Date: 2024-03-11 17:08
 * @Description:
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${doug.nickname}")
    private String name;

    @GetMapping("boot")
    public String hello(){
        System.out.println(name);
        return "hello springboot!!!";
    }
}