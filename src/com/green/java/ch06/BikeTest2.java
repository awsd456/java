package com.green.java.ch06;

public class BikeTest2 {
    public static void main(String[] args) {
        Bike b1 = new Bike("야마하", "H2-1", 10000);   //생성자를 쓰는이유 객체생성과동시에 초기화하기위해서
        //Bike b2 = new Bike(b1);
        //b2.brand = "혼다";
        Bike b2 = b1;
        b2.brand = "혼다";

        System.out.println("b1.brand : " + b1.brand);
        System.out.println("b2.brand : " + b2.brand);
    }
}
