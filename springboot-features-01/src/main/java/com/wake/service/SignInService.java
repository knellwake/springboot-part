package com.wake.service;

import com.wake.Entity.LoginSuccessEvent;
import com.wake.Entity.UserEntity;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @Author: Doug
 * @Date: 2024-04-10 16:32
 * @Description:
 */
@Service
public class SignInService {
    @EventListener
    public void onEvent(LoginSuccessEvent event) {
        System.out.println("=== SignInService 接受到事件 ===");
        UserEntity userEntity = (UserEntity) event.getSource();
        signIn(userEntity.getName());
    }

    /**
     * 登录记录 - 签到业务代码
     */
    public void signIn(String username) {
        System.out.println(username + ": 自动签到成功！");
    }
}