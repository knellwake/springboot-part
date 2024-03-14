package com.wake.mapper;

import com.wake.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> queryList();

    int delete(Integer id);
}
