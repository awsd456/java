package com.green.java.ch14;

import java.util.List;
import java.util.stream.Stream;

public class StreamStudy3 {
    public static void main(String[] args) {
//     //반복으로 람다식을 실행된 값이 다시 파라미터로 들어간다 //제한을 두지않으면 무한이다
//     //스트림은 한번사용하고나면 다시사용하지 못한다
//     Stream<Integer> evenStream= Stream.iterate(1,n->n+2);
//     evenStream.limit(1000).forEach(System.out::println);

//     List<Integer> list=Stream.iterate(1,n->n+2).toList();


        double x=66.47 +(13.75 * 171)+(5 * 65)-(6.76 *30);
        System.out.println(x);
        double y=(Math.round(x*100)/100.0);
        System.out.println(y);

    }
}
