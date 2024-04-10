package com.wake.robot.service;

import com.wake.robot.propertites.RobotPropertites;
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