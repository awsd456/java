package com.green.java.memojang;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stack111 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 1;
        boolean result=true;
        for (int i = 0; i < N; i++) {
            if(arr[i]>=num){
                while (arr[i] >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else{
                int n=stack.pop();

                if(arr[i]<n){
                    System.out.println("NO");
                    result=false;
                    break;
                }
                sb.append("-\n");
            }
        }
        if(result){
            System.out.println(sb);
        }
    }
}
