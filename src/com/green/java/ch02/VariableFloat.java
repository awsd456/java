package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] args) {
        //double(8byte),float(4byte)
        float f1=10;        //기본적으로 double 타입으로 쓰이기때문에 뒤에 d가 생략된다
        System.out.println(f1);


        f1=(float)9.77;
        f1=9.77F;
        f1=9.77f;
        System.out.println(f1);

        long l1=100;
        float f2=l1;
        System.out.println(f2);

        double d1=9.77d;
        double d2=9.77;
    }
}
