package com.example.dao;

public class UserMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("用户获取mysql数据");
    }
}
