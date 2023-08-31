package com.green.java.memojang;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class backbackback {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] arr = new char[s.length()];
        char[] ch=new char[s.length()];


        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==' '){
                ch[i]=arr[arr.length-i-1];
            }
        }


        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}

