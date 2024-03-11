package com.wake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Doug
 * @Date: 2024-03-11 20:27
 * @Description:
 */
@SpringBootApplication //自己是一个配置类，自动加载其他启动器配置类（IOC），扫描当前启动类所在的包和子包的IOC和DI注解
public class ApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class,args);
    }
}