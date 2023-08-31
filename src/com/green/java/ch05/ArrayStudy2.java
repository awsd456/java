package com.green.java.ch05;

public class ArrayStudy2 {
    public static void main(String[] args) {
//숫자타입 0 boolean타입 false String타입 null
        int[] numArr=new int[5];

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }


        boolean[] boolArr = new boolean[4];
        for (int i = 0; i < boolArr.length; i++) {
            System.out.println(boolArr[i]);
        }
    }
}
