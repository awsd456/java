package com.green.java.builder;

public class CarTest {
    public static void main(String[] args) {

      Car c1= Car.builder().cc(1000).build();
        System.out.println(c1);

      Car c2=Car.builder().model("소나타").seatCnt(5).build();
        System.out.println(c2);

    }
}





