package com.green.java.memojang;


import java.util.Arrays;
import java.util.Scanner;


public class sssss {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] arr = new int[s];
        int[] d   = new int[s];
        int temp = 0;

        for (int i = arr.length-1; i >=0; i--) {
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

       for (int j = 0; j < arr.length; j++) {
           String rz=scan.nextLine();
           if(rz.equals("+")){
               d[j]=arr[j];
               System.out.println(d[j]);
  //      } else if (rz.equals("-")) {
  //          arr[i]=0;
  //          i--;
         }
     }
       for (int i = 0; i < d.length; i++) {
           System.out.println(d[i]);
       }
        }
    }






