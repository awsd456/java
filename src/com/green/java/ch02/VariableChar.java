package com.green.java.ch02;

public class VariableChar {
    public static void main(String[] args) {
        //변수선언과 초기화 동시가능
        char c1='A';
        System.out.println(c1);


        c1='한';
        System.out.println(c1);

        c1='C';
        System.out.printf("%c:%d\n",c1,(int)c1);

    }
}
