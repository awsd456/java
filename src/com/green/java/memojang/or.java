package com.green.java.memojang;

import java.util.Scanner;

public class or {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        String str = "";
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        for (int z = 0; z <= v; z++) {
            String s = scan.nextLine();
            count1 = 0;
            count2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == ')') {

                    if (s.charAt(i) == '(') {
                        count1++;
                    } else {
                        count2++;
                    }
                }
            }
            if (count1 != 0 && count2 != 0) {
                if (count1 == count2) {
                    System.out.println("Yes");

                } else {
                    System.out.println("No");
                }
            }

        }

    }
}

