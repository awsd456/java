package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while (true) {
            System.out.print("(1)squre \n(2)squre root \n(3)log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료0)>");
           int num=scan.nextInt();

            if (num > 0 && num < 4) {
                System.out.printf("선택하신 메뉴는 %d 번입니다\n\n", num);
            } else if (num == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("메뉴를 잘못선택하셨습니다(종료0)\n");
            }
        }
    }
}


