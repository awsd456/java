package com.green.java.ch03;

public class OperatorStudy2 {
    public static void main(String[] args) {
       int num=10;
        int result=num%2;
        System.out.println("10%2="+result);
        System.out.printf("%d%%2=%d\n",num,result);

        num=9;
        result=num%2;
        System.out.println("10%2="+result);
        System.out.printf("%d%%2=%d\n",num,result);     //출력에 %를 찍고싶으면 %%를쓴다


    }
}
