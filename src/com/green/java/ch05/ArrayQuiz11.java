package com.green.java.ch05;

public class ArrayQuiz11 {
    public static void main(String[] args) {

        int[] numArr = {11, 14, 2, 7, 36, 35,1000};
        int sum=0;
        double avg=0;
        for (int i = 0; i < numArr.length; i++) {
            sum=sum+numArr[i];
        }
        avg=(double) sum/numArr.length;
        System.out.printf("sum:%,d avg=%.2f",sum,avg);
    }
}






