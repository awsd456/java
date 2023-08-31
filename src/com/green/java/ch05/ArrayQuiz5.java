package com.green.java.ch05;

public class ArrayQuiz5 {
    public static void main(String[] args) {

        int[] numArr = {11, 14, 2, 7, 36, 35};
        int oddSum = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 1) {
                oddSum += numArr[i];
            }
        }
        System.out.println("odd-sum:" + oddSum);
    }
}