package com.example.service;

import com.example.config.MyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test_pointCut(){
        //使用xml配置bean
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) context.getBean("userService");
//        userService.select();

        //使用注解配置bean
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UserService userService = (UserService) context.getBean("getUserService");
        userService.add();
    }

}
