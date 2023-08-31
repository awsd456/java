package com.green.java.ch02;

import java.util.Arrays;

public class StringStudy2 {
    public static void main(String[] args) {
       String str="  안녕하세요.**저는 홍길동** 입니다.  ";


       String r1=str.replace("*","").trim();  //앞에 문자를 뒤에 문자로 바꾼다   //trim()양끝쪽 공백을 없애준다     //체이닝기법
        System.out.println(r1);

        String str2="A:B:C:D:E:F";
        String[] strArr=str2.split(":");           //()안을잘라준다
        System.out.println(str2);
        System.out.println(Arrays.toString(strArr));

        String str3="AbCdEfG";
        String r2 = str3.toLowerCase();                 //전부소문자로 바꿔준다
        System.out.println("r2:"+r2);
        String r3=str3.toUpperCase();                   //전부대문자로 바꿔준다
        System.out.println("r3:"+r3);


    }
}
