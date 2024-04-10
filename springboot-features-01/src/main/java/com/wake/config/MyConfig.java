package com.wake.config;

import com.wake.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: Doug
 * @Date: 2024-04-09 23:23
 * @Description:
 */
@Profile("test")
@Configuration
public class MyConfig {

    @Bean
    public Dog dog() {
        return new Dog();
    }
}