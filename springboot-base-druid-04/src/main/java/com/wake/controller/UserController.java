package com.wake.controller;

import com.wake.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Doug
 * @Date: 2024-03-12 14:46
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("show")
    public List<User> show(){
        String sql = "select * from user";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return userList;
    }
}