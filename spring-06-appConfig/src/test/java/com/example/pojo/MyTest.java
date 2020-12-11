package com.example.pojo;

import com.example.config.UserConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = context.getBean("getUser", User.class);
        user.getCat().shout();
        user.getDog().shout();
    }
}
