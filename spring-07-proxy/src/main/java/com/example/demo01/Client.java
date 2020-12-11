package com.example.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        RentProxy proxy = new RentProxy();
        proxy.setHost(host);
        proxy.rent();
    }
}
