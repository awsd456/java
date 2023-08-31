package com.green.java.ch14;


import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {

        MyArrayList mList=new MyArrayList();
        mList.add(10);
        mList.add(20);
        mList.add(30);
        mList.add(40);

        System.out.println(mList);

        mList.forEach(item->{System.out.println(item);});
    //    MyArrayList mapList= mList.map(item->item%2==0);


        List<Integer> realList=new ArrayList<>();
        realList.add(10);
        realList.add(20);
        realList.add(30);
        realList.forEach(item->{System.out.println(item);});
    }


 }
