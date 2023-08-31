package com.green.java.ch14;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> Integer.parseInt(s, 16);
        Function<Integer, String> g = i -> Integer.toBinaryString(i);

        System.out.println(f.apply("F"));   //문자를 진수로 변형
        System.out.println(g.apply(9));    //10진수를 2진수로 변형

        Function<String, String> h = f.andThen(g);

        int r = f.apply("A");
        System.out.println("r = " + r); //문자를 10진수로변형
        String r2 = g.apply(r);
        System.out.println("r2 = " + r2);//10진수를 2진수로 변형
                                        //andThen은 한번에 위에두가지가 이루어짐
        System.out.println("h : "+h.apply("A"));

        Function<String,String> f2=x->x;
        System.out.println(f2.apply("AAA"));

        System.out.println("---------------------------------------");

        Predicate<Integer> p = i -> i<100;
        Predicate<Integer> q = i -> i<200;
        Predicate<Integer> r3 = i -> i%2==0;
        Predicate<Integer> notP =p.negate(); //반대가된다 !랑같은의미
        System.out.println(p.test(99));
        System.out.println(notP.test(99));

        Predicate<Integer> all =notP.and(q.or(r3));
        //and 가 연산자라서 왼쪽조건과 오른쪽조건이
        System.out.println("------------------------------------------");
        String str1="abc";
        String str2="abc";
        Predicate<String> p2=Predicate.isEqual(str1);
        System.out.println(p2.test(str2));
        System.out.println("str1==str2:"+(str1==str2));
        System.out.println("str1.quals(str2) : "+ str1.equals(str2));

    }
}
