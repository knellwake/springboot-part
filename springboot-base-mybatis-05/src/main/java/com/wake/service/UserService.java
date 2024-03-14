package com.wake.service;

import com.wake.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Doug
 * @Date: 2024-03-12 15:31
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void delete(){
        int rows = userMapper.delete(5);
        System.out.println("rows" + rows);
        //int i = 1/0; // 报错
    }
}