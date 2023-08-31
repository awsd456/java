package com.green.java.ch04;

import java.util.Scanner;

public class ForQuiz5 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요:");
Scanner scan=new Scanner(System.in);

int gugudan=scan.nextInt();
int result;
        for (int i = 1; i <10 ; i++) {
            result=gugudan*i;

            System.out.print(gugudan+"*"+i+"="+result+"\t\t");

            System.out.printf("%d*%d=%d\n",gugudan,i,result);
        }
    }
}

