package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {

        System.out.print("현재 월을 입력하세요.(1~12):");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        String season = "";
        switch (mon) {

            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                System.out.println("잘못된입력");
        }

        if (!"".equals(season)) {      //season 과 "" 바뀌면  season 의 값이 null 일때 문제가 발생한다 //null에 명령을 내리면 안된다
            System.out.println("현재계절은" + season + "입니다");
        }
    }
}

