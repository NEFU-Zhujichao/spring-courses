package com.example.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserProxy proxy = new UserProxy();
        proxy.setUserService(userService);
        proxy.add();
        proxy.delete();
        proxy.query();
        proxy.update();
    }
}
