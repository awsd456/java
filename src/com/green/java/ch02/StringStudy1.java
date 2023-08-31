package com.green.java.ch02;

public class StringStudy1 {
    public static void main(String[] args) {
        String str="abcdefghijklmn";
       String r1= str.substring(0,4);
        System.out.println(str);
        System.out.println(r1);

        String r2=str.substring(3,6);           //(3이상,6미만)
        System.out.println(r2);

        String r3=str.substring(5);    //여기서 부터 끝까지 자를때
        System.out.println(r3);

        int idx=str.indexOf("g");               //특정문자에 위치값을 알아낼때
        System.out.println("idx:"+idx);

        int len=str.length();                   //문자열 길이
        System.out.println("len:"+len);

        char[] charArr=str.toCharArray();       //캐릭터배열 딥카피해서 주소를준다
        System.out.println(charArr[0]);
        System.out.println(charArr[1]);
        charArr[0]='!';
        System.out.println(str);


    }
}
