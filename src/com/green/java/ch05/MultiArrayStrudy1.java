package com.green.java.ch05;

public class MultiArrayStrudy1 {
    public static void main(String[] args) {
    int[][] temp={
            {0,0,0},
            {0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0,0},
    };

        System.out.println(temp.length);
        System.out.println(temp[0].length);
        System.out.println(temp[1].length);
        System.out.println(temp[2].length);
        System.out.println(temp[3].length);
        System.out.println("-------------------");
        System.out.println(temp[0][0]);
        int[] arr0=temp[0];
        arr0[0]=30;

        System.out.println(temp[0][0]);
        System.out.println("---------------------");
        int[][] score=new int[4][3];

        System.out.println(score[0][0]);
        score[2][1]=10;
        System.out.println(score[2][1]);

        System.out.println(score.length);       //행의개수
        System.out.println(score[0].length);    //행의 열개수

    }
}
