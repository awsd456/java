package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {

        //리터럴 Literal
        //-128~127
        byte b1 = 127;
        System.out.println(b1);

        int i1=129;
        int i2=(int)b1;//자동형변환
        if(i1<Byte.MAX_VALUE && i1>=Byte.MIN_VALUE){
            b1=(byte)i1;        //강제형변환
        }

        System.out.println(b1);

        b1=(byte)-129;
        System.out.println(b1);



    }
}
