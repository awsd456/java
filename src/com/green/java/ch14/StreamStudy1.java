package com.green.java.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy1 {
    public static void main(String[] args) {
        //이거랑 같은 의미 int[] intArr={1,2,3,4,5};
        List<Integer> intList= Arrays.asList(10,20,3,4,5,4,3,20,10,100,200,300);
//       Stream<Integer> intStream=intList.stream();
//       intStream.forEach(System.out::println);

        //distinct()는 중복제거 //skip은 앞부터 2개를 스킵한다 //limit 앞에서3개만 보여준다
        intList.stream()
                .distinct()
                .skip(2)
                .limit(3)
                .forEach(item->{
                    System.out.print(item+",");
                });
        System.out.println("-----------------------");
        int[] intArr={99,1,2,9,3,110,4,5};
        IntStream intArrStream=Arrays.stream(intArr);
        intArrStream.sorted().forEach(System.out::println);
        System.out.println(Arrays.toString(intArr));





    }
}
