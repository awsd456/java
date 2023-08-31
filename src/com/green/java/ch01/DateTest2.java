package com.green.java.ch01;

public class DateTest2 {
    public static void main(String[] args) {
        int y = 2023, m = 4, d = 27;
       String sMon=(m<10?"0":"")+String.valueOf(m);
       String sDay=(d<10?"0":"")+String.valueOf(d);


        System.out.println(y+"-"+sMon+"-"+sDay);
    }
}
