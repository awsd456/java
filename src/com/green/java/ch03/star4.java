package com.green.java.ch03;

import java.util.Scanner;

public class star4 {
    public static void main(String[] args) {

        System.out.print("숫자를 입력하세요:");
        Scanner scan=new Scanner(System.in);
        int star=scan.nextInt();

        int i, j, k;
        for ( i = 0; i <star ; i++) {
            for(j=i;j<star-1;j++){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }



        for(i=0;i<star;i++){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(k=i;k<star-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}