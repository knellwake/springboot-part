package com.wake;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Doug
 * @Date: 2024-03-12 15:13
 * @Description:
 */
@MapperScan("com.wake.mapper")
@SpringBootApplication
public class MybatisMain {
    public static void main(String[] args) {
        SpringApplication.run(MybatisMain.class,args);
    }
}