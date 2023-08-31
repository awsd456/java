package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요.>");
        String temp = scan.nextLine();
        num = Integer.parseInt(temp);

       while(num>0){
           System.out.printf("현재자리수:%-9d   현재합계:%d\n",num,sum);
           sum=sum+(num%10);
           num=num/10;
       }
       System.out.println("각 자리수의 합:"+sum);

        for ( ; num >0 ; ) {
            System.out.printf("현재자리수:%-10d  나머지자리수:%-10d 나머지수자리수+합계:%d+%d=%d\n",num,num%10,(num%10),sum,(num%10)+sum);
            sum=sum+(num%10);

            num=num/10;
        }
        System.out.println("\n각 자리수의 합:"+sum);
    }
}


