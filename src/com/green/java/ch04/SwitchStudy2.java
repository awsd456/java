package com.green.java.ch04;

import java.util.Scanner;

public class SwitchStudy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수 입력:");
        int score = scan.nextInt();
        char grade;
        switch (score/10) {
            case 10:
            case 9:
                grade = 'A';
                break;

            case 8:
                grade = 'B';
                break;

            case 7:
                grade = 'C';
                break;

            default:
                grade = 'D';
                break;
        }
                System.out.printf("%d의 학점은 %c입니다",score,grade);

    }
}



