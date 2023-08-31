package com.green.java.ch03;

public class star1 {
    public static void main(String[] args) {
        int i,j,k;
       int star=7;

        for ( i = 0; i <star ; i++) {
            for(j=i;j<star-1;j++){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
