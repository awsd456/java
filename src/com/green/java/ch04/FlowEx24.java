package com.green.java.ch04;

public class FlowEx24 {
    public static void main(String[] args) {


        int i = 11;
        System.out.println("카운트 다운 시작");

        while (i-- != 0) {
            System.out.println(i);
            for (long j = 0; j < 2_000_000_000L; j++) {
                ;
            }
        }
        System.out.println("끝!");
    }
}

