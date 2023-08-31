package com.green.java.ch02;

public class VariableString3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();       //문자열 합칠때쓰는
        sb.append("하하");
        sb.append("후후");

        System.out.println(sb.toString());
    }
}
