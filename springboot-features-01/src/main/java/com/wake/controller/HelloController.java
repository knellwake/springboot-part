package com.wake.controller;

import com.wake.Entity.LoginSuccessEvent;
import com.wake.Entity.UserEntity;
import com.wake.event.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Doug
 * @Date: 2024-04-10 16:09
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private EventPublisher eventPublisher;

    @GetMapping("/login")
    public String login(@RequestParam String name,
                        @RequestParam String pwd){

        System.out.println("=== login 业务====");

        // 1. 创建事件信息
        LoginSuccessEvent event = new LoginSuccessEvent(new UserEntity(name, pwd));
        // 2. 发送事件
        eventPublisher.sendEvent(event);

        return name+"登录成功";
    }
}