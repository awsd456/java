package com.green.java.ioc.prev;

import com.green.java.ioc.Tv;

public class IocTest {
    public static void main(String[] args) {

        Tv tv=new SamsunTv();
        tv.turnOn();
        System.out.println("---------------------------");
        tv.turnOff();


    }
}
