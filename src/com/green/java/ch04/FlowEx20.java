package com.green.java.ch04;

public class FlowEx20 {
    public static void main(String[] args) {

        int num=4;

        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num; j++) {
                if(i==j) {
                    System.out.printf("[%d,%d]", i, j);
                }
                System.out.printf("%5c",' ');
            }
            System.out.println();
        }
    }
}

