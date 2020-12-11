package com.example.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), userService.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(userService, objects);
        return invoke;
    }
    public void log(String msg){
        System.out.println("[Debug]:执行了"+msg+"方法");
    }
}
