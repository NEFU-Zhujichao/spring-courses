package com.example.demo03;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        MyInvocationHandler mih = new MyInvocationHandler();
        mih.setUserService(userService);
        UserService proxy = (UserService) mih.getProxy();
        proxy.add();
        proxy.delete();
        proxy.query();
        proxy.update();
    }
}
