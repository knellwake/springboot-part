package com.wake.service;

import com.wake.Entity.LoginSuccessEvent;
import com.wake.Entity.UserEntity;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @Author: Doug
 * @Date: 2024-04-10 16:29
 * @Description:
 */
@Service
public class AccountService implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println("=== AccountService 接受到事件 ===");
        UserEntity source = (UserEntity)event.getSource();
        addAccountScore(source.getName());
    }

    /**
     * 增加积分业务代码
     */
    public void addAccountScore(String Username){
        System.out.println(Username+"加1积分");
    }
}