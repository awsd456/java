package com.green.java.ch07.arraylist;

import java.util.Arrays;

public class MyArrayList {
    private int[] items;

    public MyArrayList() {
        items = new int[0];

        System.out.println(items.length);
    }

    public void add(int value) {

        int[] temp = new int[items.length + 1];
        temp[items.length] = value;

        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    void add(int idx, int value) {
        if (idx > items.length) {
            return;
        }
        int[] temp = new int[items.length + 1];
        temp[idx] = value;
        for (int i = 0; i < items.length; i++) {
            if (i < idx) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }
        }
        items = temp;
    }

    public String toString() {
        String str = "[";
        if (items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " + items[i];
            }
        }
        str += "]";
        return str;
    }

    public int get(int num) {
        return items[num];
    }

    public int size() {
        return items.length;
    }

    public void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < items.length; i++) {
            for (int z = 0; z < items.length - 1 - i; z++) {
                if (items[z] > items[z + 1]) {
                    temp = items[z];
                    items[z] = items[z + 1];
                    items[z + 1] = temp;
                }
            }
        }
    }

    void set(int idx, int value) {

        items[idx] = value;
    }

    boolean contains(int value) {

        for (int b:items) {
            if(b==value) return true;
        }
        return false;
    }
}















