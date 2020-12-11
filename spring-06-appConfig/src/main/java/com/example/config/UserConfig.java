package com.example.config;

import com.example.pojo.Cat;
import com.example.pojo.Dog;
import com.example.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.example")
@Import(MyConfig.class)
public class UserConfig {

    @Bean
    public User getUser(){
        return new User();
    }
    @Bean
    public Cat getCat(){
        return new Cat();
    }
    @Bean
    public Dog getDog(){
        return new Dog();
    }
}
