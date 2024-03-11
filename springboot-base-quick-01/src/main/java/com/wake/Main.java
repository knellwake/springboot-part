package com.wake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Doug
 * @Date: 2024-03-11 17:06
 * @Description:
 */
@SpringBootApplication //启动类
public class Main {
    public static void main(String[] args) {
        //自动创建IOC容器，启动tomcat服务器
        SpringApplication.run(Main.class,args);
    }
}