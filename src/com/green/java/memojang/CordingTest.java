package com.green.java.memojang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CordingTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List list = new LinkedList();
        int s = scan.nextInt();

        for (int i = 0; i < s; i++) {
            switch (scan.next()) {
                case "push_front":
                    list.add(scan.nextInt());
                    break;
                case "push_back":
                    list.add(0, scan.nextInt());
                    break;
                case "pop_front":
                    if (list.size() == 0) {
                        pop();
                        break;
                    } else {
                        System.out.println(list.remove(list.size() - 1));
                        break;
                    }
                case "pop_back":
                    if (list.size() == 0) {
                        pop();
                        break;
                    } else {
                        System.out.println(list.remove(0));
                        break;
                    }
                case "size":
                    System.out.println(list.size());
                    break;
                case "empty":
                    if (list.size() == 0) {
                        efb();
                        break;
                    } else {
                        System.out.println(0);
                        break;
                    }
                case "front":
                    if (list.size() == 0) {
                        efb();
                        break;
                    } else {
                        System.out.println(list.get(list.size() - 1));
                        break;
                    }
                case "back":
                    if (list.size() == 0) {
                        efb();
                        break;
                    } else {
                        System.out.println(list.get(0));
                        break;
                    }
            }
        }
    }
    static void pop(){
        System.out.println(-1);
    }
    static void efb(){
        System.out.println(1);
    }
}

