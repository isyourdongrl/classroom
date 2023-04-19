package com.jml.dao;

import com.jml.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User createUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    User queryUserById(int id);

    List<User> queryUserList();
}
