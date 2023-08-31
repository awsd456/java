package com.green.java.ch05;

public class ArrayEx18 {
    public static void main(String[] args) {

        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
        };

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int z = 0; z < score[i].length; z++) {
                sum += score[i][z];
            }
        }

        for (int i = 0; i < score.length; i++) {
            for (int z = 0; z < score[i].length; z++) {
                System.out.printf("score[%d][%d]=%d\n", i, z, score[i][z]);
            }
        }
        System.out.println("sum=" + sum);
    }
}
