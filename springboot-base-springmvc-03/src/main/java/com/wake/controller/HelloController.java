package com.wake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Doug
 * @Date: 2024-03-11 23:29
 * @Description:
 */
@Controller
@ResponseBody
public class HelloController {
    @GetMapping("show")
    public String show(){
        return "Hello SpringBoot! MVC!";
    }
}