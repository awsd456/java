package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("이름 입력:");
        String name=sc.nextLine();

        System.out.print("나이 입력:");
        int age=sc.nextInt();

        System.out.printf("나의 이름은 %s 만나이는 %d 살 입니다\n",name,age-1);
        System.out.println("나의 이름은 "+name+"나이는"+age+"살 입니다");
        //나의 이름은 홍기윤이고 나이는 00살입니다
    }
}
