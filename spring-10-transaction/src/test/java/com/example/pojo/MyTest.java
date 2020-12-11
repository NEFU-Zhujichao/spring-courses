package com.example.pojo;

import com.example.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void test_getUsers() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapperImpl", UserMapper.class);
        List<User> userList = mapper.getUsers();
        userList.forEach(x -> System.out.println(x));
    }
}
