package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUsers();

    int addUser(User user);

    int deleteUser(@Param("uid") int id);
}
