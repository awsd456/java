package com.green.java.ch04;

import java.util.Scanner;

class ScoreObj{
    char getGrade(int score){

        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else return 'D';
    }
}

public class FlowEx4Method {

    public static void main(String[] args) {

        int score;
        char grade,grade1;

        System.out.print("점수를 입력하세요.>");
        Scanner scan=new Scanner(System.in);
        score=scan.nextInt();

        ScoreObj so=new ScoreObj();
        grade=so.getGrade(score);
        score=scan.nextInt();
        grade1=so.getGrade(score);

      System.out.printf("%d점의 학점은%c입니다",score,grade);
      System.out.printf("%d점의 학점은%c입니다",score,grade1);
    }
}
