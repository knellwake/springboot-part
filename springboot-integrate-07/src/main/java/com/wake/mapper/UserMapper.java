package com.wake.mapper;

import com.wake.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author Administrator
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2024-03-19 14:32:13
* @Entity com.wake.pojo.User
*/
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 显示全部
     * @return
     */
    @Select("select * from user")
    List<User> selectAll();
}