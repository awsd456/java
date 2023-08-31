package com.green.java.ch07.arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        int sum = 0;
        MyArrayList myList = new MyArrayList();

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);


        myList.add(3, 100);
        System.out.println(myList);

        int v1 = myList.get(0);
        System.out.println(v1);
        int v2 = myList.get(1);
        System.out.println(v2);
        System.out.println("-----------------------------------");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println("-------------------------------------");

        for (int i = 0; i < myList.size(); i++) {
            sum += myList.get(i);
        }
        System.out.println(sum);
    }
}
