package com.wake.boot.starter.robot.service;


import com.wake.boot.starter.robot.propertites.RobotPropertites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotService {

    @Autowired
    private RobotPropertites robotPropertites;

    public String show() {
        return "姓名：" + robotPropertites.getName() + " 年龄: " + robotPropertites.getAge() + " 邮箱：" + robotPropertites.getEmail();
    }
}