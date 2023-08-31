package com.green.java.memojang;

public class examTest {

    int[][] Score={
            {100, 90, 80},
            {20, 20, 20},
            {30, 30, 30},
            {40, 40, 40}, };

    String[] subject={"번호","국어","영어","수학","총점","평균"};
int sum=0;
double avg=0;
int korsum,engsum,mathsum;
    void set(){
        for (int i = 0; i < subject.length; i++) {
            System.out.printf("%s\t",subject[i]);
        }
        System.out.println("\n===========================");
        for (int i = 0; i < Score.length; i++) {        //4
            System.out.printf("%d",i+1);
            sum=0;

            korsum+=Score[i][0];
            engsum+=Score[i][1];
            mathsum+=Score[i][2];
            for (int j = 0; j < Score[i].length; j++) {    //3
                System.out.printf("\t%d",Score[i][j]);
                sum+=Score[i][j];

            }
            double avg=(double)sum/Score[i].length;

            System.out.print("\t"+sum);
            System.out.printf("\t%.2f",avg);
            System.out.println();
        }
        System.out.println("==========================");
        System.out.printf("총점:%d\t%d\t%d",korsum,engsum,mathsum);
        }
    }


