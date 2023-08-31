package com.green.java.ch14;

public class MyArrayListTest5 {
    public static void main(String[] args) {

        MyArrayList ma = new MyArrayList();
        for (int i = 100; i <= 120; i++) {
            ma.add(i);
        }
        System.out.println(ma);


        MyArrayList ma2 = ma.map(item -> {
//        if (item <= 110) {
//            return item + 1;
//        } else {
//            return item * 2;
//        }
          return item <= 100 ? item + 1 : item * 2;
        });

        System.out.println(ma2);
    }
}
