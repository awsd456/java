package com.green.java.ch06;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {        //public은 상수일때준다 값이 변하지않으니까
        Scanner scan = new Scanner(System.in);      //private 그외 변수
        Time t1 = new Time();
        //hour 1~23

        System.out.print("시간을 입력하시오. ");
        int hour = scan.nextInt();
        System.out.println("hour: " + t1.getHour());

        t1.setHour(hour);
        System.out.println("hour: " + t1.getHour());


    }
}

