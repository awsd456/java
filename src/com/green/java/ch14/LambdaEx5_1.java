package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5_1 {
    public static void main(String[] args) {

        Supplier<Integer> s=()->(int)(Math.random()*100)+1; //1~100사이
        Consumer<Integer> c= i -> System.out.print(i+", ");
        Predicate<Integer> p= i -> i%2==0;
        Function<Integer,Integer> f = i -> i/10*10; //1의 자리를 0으로 바꾼다
        List<Integer> list=new ArrayList();
        makeRandomList(s,list);
        System.out.println(list);
        printEvenNum(p,c,list);
        System.out.println();
        List<Integer> newList=doSomething(f,list);
        System.out.println(newList);

        List<Integer> newList2=doSomthing2(f,list);
        System.out.println(newList2);
    }

    public static void makeRandomList(Supplier<Integer> s, List<Integer> list){
        for (int i = 0; i < 10; i++) {
             list.add(s.get());
        }
    }

    public static void printEvenNum(Predicate<Integer> p,Consumer<Integer> c,List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
           if(p.test(list.get(i))){
               c.accept(list.get(i));
           }
        }
    }


    public static <T> List<T> doSomthing2(Function<T,T> f,List<T> list){
        return list.stream().map(f).toList();
    }


    public static List<Integer> doSomething(Function<Integer,Integer> f,List<Integer> list){
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(f.apply(list.get(i)));
        }
        return list1;
    }
}
