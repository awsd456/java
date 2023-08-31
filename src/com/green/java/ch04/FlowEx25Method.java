package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25Method {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요.>");
        String temp = scan.nextLine();
        int sum=sumStringNumber(temp);
        System.out.printf("각 자리수의 합:%d\n",sum);

    }
    static int sumStringNumber(String temp){
        int num=Integer.parseInt(temp);
        int sum=0;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        return sum;
    }
}

