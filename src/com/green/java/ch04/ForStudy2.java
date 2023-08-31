package com.green.java.ch04;

public class ForStudy2 {
    public static void main(String[] args) {
int result;
        for (int i = 1; i <8 ; i++) {
            if(i<7){
                System.out.print(i+", ");
            }
            else {
                System.out.print(i);
            }
        }
        System.out.println();
        for (int i = 1; i <7 ; i++) {
            System.out.print(i);
            if(i<6){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 1; i < 6; i++) {
            if(i>1){
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}
