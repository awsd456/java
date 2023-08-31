package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx17Method {
    public static void main(String[] args) {

        int star = 5;

        printStarLine(star);
        printStarLine(3);
        printStarLine(11);
        System.out.println("----------------------");
        printStarRect(5);
        System.out.println("------------------------");
        printStarTri(5);
    }

    static void printStarLine(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
            System.out.println();
    }
    static void printStarRect(int star){
        for (int i = 0; i < star; i++) {
            printStarLine(star);
        }
    }
    static void printStarTri(int star){
        for (int i = 1; i <= star; i++) {
            printStarLine(i);
        }
    }
}




