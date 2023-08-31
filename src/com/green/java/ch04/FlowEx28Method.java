package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28Method {
    public static void main(String[] args) {
        int input, answer;

        Scanner scan = new Scanner(System.in);

        answer = getRandomNumber(1, 100);
        System.out.println(answer);
    }
     static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);   //min~max사이의 랜덤값 구하기
    }



}





