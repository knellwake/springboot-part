package com.wake;

import com.wake.boot.starter.robot.annotation.EnableRobot;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Mapper接口：
 * 表示当前接口为mybatis中的Mapper接口
 *   程序运行时会自动创建接口的实现类对象(代理对象)，并交给Spring的IOC容器管理
 *   @MapperScan("com.wake.mapper") 直接全扫描，不用单个添加
 */
@MapperScan("com.wake.mapper")
@SpringBootApplication
//@EnableRobot
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}