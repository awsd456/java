package com.green.java.memojang;

import java.util.Scanner;
import java.util.Stack;

public class Word {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();                 //반복횟수

        for (int i = 0; i < testCase; i++) {
            Stack stack = new Stack<>();
            String s = scan.nextLine();                 //뒤집을 단어 정하기

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {                    //charAt해당번째에 문자를 뜻한다
                    while (!stack.empty()) {                 //stack이 비어있는지 확인 비어있으면 true 아니면 false
                        System.out.print(stack.pop());       //스택에 가장위쪽에있는 값을 [출력]하고 제거힌다
                    }
                    System.out.print(" ");                   //출력될때 입력된만큼 공백을 준다
                }
                else {
                    stack.add(s.charAt(j));                 //문자열을 문자로바꾸어 스택에 차례대로 쌓는다
                }
          }

   //  while (!stack.empty()) {                          //입력을 마지막에 공백을 주지않으면 마지막에 실행이 않되기때문에 마지막에 pop을 한번더해준다
   //      System.out.print(stack.pop());
   //  }
   //  System.out.println();

       }
    }
}
