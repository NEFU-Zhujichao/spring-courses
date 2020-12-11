package com.example.mapper;

import com.example.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUsers();

    int addUser(Map map);
}
