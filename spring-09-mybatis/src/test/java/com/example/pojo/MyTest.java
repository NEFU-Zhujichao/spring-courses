package com.example.pojo;

import com.example.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void test_getUsers() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapperImpl2", UserMapper.class);
        HashMap map = new HashMap();
        map.put("id",9);
        map.put("name","奥利奥");
        mapper.addUser(map);
        for (User user : mapper.getUsers()) {
            System.out.println(user);
        }
    }
}
