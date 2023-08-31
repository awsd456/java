package com.green.java.ch06;

public class Tv {
    //인스턴스 멤버필드
    String color;
    static boolean power;
    int channel;

    static String brand;                //클래스 멤버필드

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

    static String getBrand() {           //static은 인스턴스변수를 사용할수없다 static은 static만 가능 static은 하나에값만 받을수있음
        return brand;
    }
}
