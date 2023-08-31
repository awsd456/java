package com.green.java.ch04;

import java.util.Scanner;
class SeasonObj{
    String season=" ";
   String getSeason(int a) {
       //   switch(a) {
       //       case 3:
       //       case 4:
       //       case 5:
       //           return  "봄";
       //       case 6:
       //       case 7:
       //       case 8:
       //           return "여름";
       //       case 9:
       //       case 10:
       //       case 11:
       //           return "가을";
       //       case 12:
       //       case 1:
       //       case 2:
       //           return "겨울";
       //       default:
       //          return null;

       if (a > 12 || a <= 0) {
           return null;
       } else if (a == 12 || a <= 2) {
           return "겨울";
       } else if (a >= 9) {
           return "가을";
       } else if (a >= 6) {
           return "여름";
       } else {
           return "봄";
       }
   }
   }


public class FlowEx6Method {
    public static void main(String[] args) {

        System.out.print("현재 월을 입력하세요.(1~12):");
        Scanner scan=new Scanner(System.in);
        int mon=scan.nextInt();
        SeasonObj so=new SeasonObj();
        String result=so.getSeason(mon);

        if(result==null){
            System.out.println("잘못된입력입니다.");
        }
        else{
            System.out.printf("현재의 계절은 %s입니다",result);
        }
    }
}

