package com.example.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBean("student"));
    }
    @Test
    public void test_userBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        User user3 = context.getBean("user2", User.class);
        User user4 = context.getBean("user2", User.class);
        System.out.println(user3);
        System.out.println(user2==user);
        System.out.println(user2==user3);
        System.out.println(user4==user3);
    }
}
