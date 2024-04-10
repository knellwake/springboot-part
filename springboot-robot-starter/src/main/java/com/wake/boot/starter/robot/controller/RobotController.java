package com.wake.boot.starter.robot.controller;


import com.wake.boot.starter.robot.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/robot")
public class RobotController {
    @Autowired
    private RobotService robotService;

    @GetMapping("/hello")
    public String show(){
       return robotService.show();
    }
}