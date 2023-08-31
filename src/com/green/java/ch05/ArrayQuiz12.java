package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz12 {
    public static void main(String[] args) {

        int[] numArr = {11, 14, 2, 7, 36, 35};
        int n;
        int temp;

        for (int i = 0; i < numArr.length; i++) {
            n = (int) (Math.random() * numArr.length);
            if (i == n) {
                continue;
            }
            temp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = temp;

        }
        System.out.println(Arrays.toString(numArr));
    }
}


