package com.green.java.ch03;

public class OperatorEx32Quiz1 {
    public static void main(String[] args) {

        OperatorEx32Quiz1 q=new OperatorEx32Quiz1();


        int x=12,y=-8,z=0;
        int absX,absY,absZ;

        absX=q.getAbs(x);
        absY=q.getAbs(y);
        absZ=q.getAbs(z);

 //      absX=getAbs(x);
 //      absY=getAbs(y);
 //      absZ=getAbs(z);
        System.out.println("absX:"+absX);
        System.out.println("absY:"+absY);
        System.out.println("absZ:"+absZ);


    }
     int getAbs(int num) {
        if (num < 0) {
            return -num;
        } else  {
            return num;
        }
    }
}
