package com.green.java.ch05;

public class ArrayEx19 {
    public static void main(String[] args) {

        int[][] score = {
                {100, 90, 80},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
        };
        int sum = 0;
        double avg = 0.0;
        int korsum = 0, engsum = 0, mathsum = 0;
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("=========================");
        for (int i = 0; i < score.length; i++) {
            System.out.print(i + 1);
            korsum += score[i][0];
            engsum += score[i][1];
            mathsum += score[i][2];
            sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                System.out.print("\t" + score[i][j]);
                sum += score[i][j];
            }
            avg = (double) sum / score[i].length;
            System.out.printf("\t%d\t%.1f",sum,avg);
            System.out.println();
        }
        System.out.println("=========================");
        System.out.printf("총점\n국어:%d\n영어:%d\n수학:%d\n", korsum, engsum, mathsum);
    }
}
