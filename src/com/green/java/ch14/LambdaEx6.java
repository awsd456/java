package com.green.java.ch14;


import java.util.function.*;

public class LambdaEx6 {
    public static void main(String[] args) {

        Supplier<Integer> s=() -> (int)(Math.random()*100)+1;
        IntSupplier s2=() -> (int)(Math.random()*100)+1; //위에거랑 똑같은데 이게 속도가 빠르다
        IntFunction<Double> iff =i->(double)i/3;    //타입은 들어가는 타입 <안에는 return타입>
        IntConsumer ic;
        IntPredicate ip;
        DoubleSupplier ds;


    }
}
