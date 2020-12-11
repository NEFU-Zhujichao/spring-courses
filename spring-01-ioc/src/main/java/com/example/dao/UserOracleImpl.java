package com.example.dao;

public class UserOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("用户获取Oracle数据");
    }
}
