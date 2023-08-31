package com.green.java.ch04;

import java.util.Scanner;

class ScoreObj2{
    String getGrade(int score){
        String grade="",otp="";

        if (score > 100 || score < 0) {
             return "점수는0~100사이입니다.";

        } else {
            if (score >= 90) {
                grade = "A";

            } else if (score >= 80) {
                grade = "B";

            } else if (score >= 70) {
                grade = "C";

            } else {
                grade = "D";
            }
        }
        int num = score % 10;
        if (grade != "D") {
            if (num >= 8 || score == 100) {
                otp = "+";
            } else if (num < 4) {
                otp = "-";
            } else
                otp = "0";
        }
        return String.format("%d점의 학점은%s입니다",score,grade+otp);
    }
}

public class FlowEx5Method {
    public static void main(String[] args) {

        int score;
        char grade = ' ', otp = '0';

        System.out.print("점수를 입력하세요.>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        ScoreObj2 so=new ScoreObj2();
        String result=so.getGrade(score);
        System.out.println(result);
    }
}

