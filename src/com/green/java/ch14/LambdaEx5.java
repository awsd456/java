package com.green.java.ch14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Supplier 제공만한다
//wrapper type 기본형을 감싸는 객체타입
//인터페이스는 강제성이있다,상속관계
//@FunctionalInterface 추상메소드가 하나만있을수있다
public class LambdaEx5 {
    public static void main(String[] args) {


        Supplier<Integer> s=()->(int)(Math.random()*100)+2;
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());



        Consumer<Integer> c = i-> System.out.println(i);
        Consumer<Integer> c4 = System.out::println; //파라미터와 println의 값이 같으면 생략가능
        c.accept(100);

        int val=9;
        Predicate<Integer> p1 = i -> i>10;
        System.out.printf("%d>10 : %b\n",val,p1.test(val));


        Function<Double,Integer> fn1=item-> item.intValue();

        System.out.println(fn1.apply(10.5));


        Integer n1=10;
        int n2=n1;
        n1=20;

    }
}
