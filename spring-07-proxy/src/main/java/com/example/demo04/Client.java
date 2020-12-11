package com.example.demo04;

import org.junit.Test;

public class Client {
    @Test
    public void test_MIH(){
        Host host = new Host();
        MyInvocationHandler mih = new MyInvocationHandler();
        mih.setTarget(host);
        Rent proxy = (Rent) mih.getProxy();
        proxy.rent();
    }
}
