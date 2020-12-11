package com.example.config;

import com.example.diy.AnnoPointCut;
import com.example.service.UserService;
import com.example.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example")
public class MyConfig {
//    @Bean
//    public AnnoPointCut getConfig(){
//        return new AnnoPointCut();
//    }
    @Bean
    public UserServiceImpl getUserService(){
        return new UserServiceImpl();
    }
}
