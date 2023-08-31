package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        List list=new ArrayList();  //수정을 많이할때는 LinkedList 를 쓴다   //List는 인터페이스다     //ArrayList는객체이다      (단점)//모든타입을 담을수있다 그래서 뭐가나올지 타입을 기억해야한다
        list.add(10);
        list.add(20);
        list.add("ddd");

        Object obj=10;
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));



        int n1=(int)list.get(0);
        int n2=(int)list.get(1);
        String str1=(String)list.get(2);



    }
}
