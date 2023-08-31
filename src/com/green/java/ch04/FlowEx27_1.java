package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27_1 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면0)");

        while (true) {
            System.out.print(">>");
            num = scan.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("합계:"+sum);
    }
}





