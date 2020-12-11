package com.example.demo04;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        ArrayList list = new ArrayList();
        list.add("zhujichao");
        list.add("niu");
        makeFriends(list);
        seeHouse();
        Object invoke = method.invoke(target,objects);
        free();
        return invoke;
    }
    public void seeHouse(){
        System.out.println("中介带你看房子");
    }
    public void free(){
        System.out.println("收中介费");
    }
    public void makeFriends(List list){
        list.forEach(x -> System.out.println(x));
        System.out.println("中介和你交朋友");
    }
}
