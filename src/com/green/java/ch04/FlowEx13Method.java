package com.green.java.ch04;

public class FlowEx13Method {
    public static void main(String[] args) {

        printAllSum(1, 100);

        printAllSum(2, 3);
    }
    public static void printAllSum(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum = sum + i;
        }
        System.out.printf("min값:%d~max값:%d sum=%d\n", min, max, sum);
    }
}

