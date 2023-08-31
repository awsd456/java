package com.green.java.ch02;

public class PrintfEx2 {
    public static void main(String[] args) {

        String url="http://www.codechobo.com";
        float f1=.10F;
        double d=1.2345678;

        System.out.printf("f1=%f,%e,%g\n",f1,f1,f1);
        System.out.printf("d=%14.10f\n",d);  //14칸확보후 소수점10째자리까지 표시
        System.out.printf("d=%.3f\n",d);

        System.out.println("[12345678901234567890]");
        System.out.printf("[%s]\n",url);
        System.out.printf("[%30s]\n",url);  //30칸확보
        System.out.printf("[%-30s]\n",url);
        System.out.printf("[%.8s]\n",url); //문자열일때는 자르기

    }
}
