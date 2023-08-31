package com.green.java.memojang;

import java.util.Scanner;
import java.util.Stack;

public class Word_Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();

        for (int i = 0; i < idx; i++) {
            Stack stack=new Stack<>();
            String s=scan.nextLine();

            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)==' '){
                    while(!stack.empty()){
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                }else{
                    stack.add(s.charAt(j));
                }

            }
            while(!stack.empty()){
                System.out.print(stack.pop());
            }
        }

    }
}