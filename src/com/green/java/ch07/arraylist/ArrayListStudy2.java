package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
                //제네릭
        int a=10;
        Integer a2=a;
        double d=10.2;
        Double d2=d;
        ArrayList<Integer> list=new ArrayList<>();          //<원하는타입> 원하는타입만 담을수있다
    //   list.add("11");
    //  list.add(10.1);
    //  list.add(true);
        list.add(10);
        list.add(13);

        int n1= list.get(0);
        System.out.println(list);       //toString 을 오버라이딩 되어있다
    }
}
