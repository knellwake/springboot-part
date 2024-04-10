package com.wake.Entity;

import org.springframework.context.ApplicationEvent;

/**
 * @Description: 登录成功消息事件
 */
public class LoginSuccessEvent extends ApplicationEvent {

    /**
     * 代表谁登录成功
     * @param source
     */
    public LoginSuccessEvent(UserEntity source) {
        super(source);
    }
}