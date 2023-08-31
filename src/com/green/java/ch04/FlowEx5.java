package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {

        int score;
        char grade = ' ', otp = '0';

        System.out.print("점수를 입력하세요.>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("점수는0~100사이입니다.");
        } else {
            if (score >= 90) {
                grade = 'A';

            } else if (score >= 80) {
                grade = 'B';

            } else if (score >= 70) {
                grade = 'C';

            } else {
                grade = 'D';
            }
        }

        if (grade != 'D') {
            int num = score % 10;
            if (num >= 8 || score == 100) {
                otp = '+';
            } else if (num < 4) {
                otp = '-';
            } else
                otp = ' ';
        }
        System.out.printf("%d점의 학점은%c%c입니다", score, grade, otp);
    }
}

