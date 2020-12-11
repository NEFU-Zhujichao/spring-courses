package com.example.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;


public class People {
    private String name;
    @Autowired
    //@Qualifier(value = "dog2")
    //@Resource
    private Dog dog;
    @Autowired
    //@Qualifier(value = "cat2")
    //@Resource
    private Cat cat;
    public String getName() {
        return name;
    }

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
