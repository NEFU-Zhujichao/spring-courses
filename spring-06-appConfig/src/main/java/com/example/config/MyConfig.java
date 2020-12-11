package com.example.config;

import com.example.pojo.User;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    public User MyUser(){
        return new User();
    }
}
