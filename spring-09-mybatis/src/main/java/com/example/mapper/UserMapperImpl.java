package com.example.mapper;

import com.example.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getUsers() {
        return sqlSession.getMapper(UserMapper.class).getUsers();
    }

    @Override
    public int addUser(Map map) {
        return sqlSession.getMapper(UserMapper.class).addUser(map);
    }
}
