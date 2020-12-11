package com.example.demo01;

public class RentProxy implements Rent{
    private Host host;

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        free();
    }
    public void free(){
        System.out.println("收中介费");
    }
    public void seeHouse(){
        System.out.println("中介带你看房子");
    }
}
