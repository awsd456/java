package com.green.java.ch05;

public class ArrayEx12 {
    public static void main(String[] args) {

        String[] names={"kim","park","yi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("names["+i+"]:"+names[i]);
        }

        names[0]="yu";

        int i=0;
        for (String nm:names) {                         //for(     :값을여러개담을수있는변수 순서대로)
            System.out.printf("names[%d]:%s\n",i++,nm);
        }
    }
}
