package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input,answer;
        answer=(int)(Math.random()*100)+1;
        System.out.println(answer);
        Scanner scan=new Scanner(System.in);


        do {
            System.out.print("1~100사이의 정수를 입력:");
            input = scan.nextInt();
            if (input > answer) {
                System.out.println("down");
            } else if (input < answer) {
                System.out.println("up");
            }
            else {
                System.out.println("good!");
            }

          }while(input!=answer);
        }
    }

