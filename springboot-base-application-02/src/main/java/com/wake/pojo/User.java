package com.wake.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description:
 *  1. 读取配置方式一 ： @Value
 *      直接在属性上赋值
 *      只能读取单个值，集合就不能读取，会报错
 *  2. 批量配置读取 ：
 *      @ConfigurationProperties(prefix = "doug.user") 通用的前缀
 *     不用一个一个属性赋值，集合也能赋值了
 */
@Data
@Component
@ConfigurationProperties(prefix = "doug.user")
public class User {
    private String username;
    private String pwd;
    private List<String> gfs;
}