package com.green.java.ch14;

public class CalculratableTest {
    public static void main(String[] args) {

        //인터페이스 타입으로 바로 구현을 해준다
        Calculatable cc=new Calculatable() {    //인터페이스를 객체화를하면 익명클래스가 생성되고 무조건 구현부가 생성된다
            @Override
            public int calc(int n1, int n2) {
                return n1+n2;
            }
        };

        int result=cc.calc(10,20);
        System.out.println("result = " + result);

        //인터페이스에 적혀있기때문에 타입을 생략해도된다 //중괄호는 1줄이상이면 무조건 적어줘야된다
        Calculatable cc2=(n1,n2)->n1+n2;
        int result2=cc2.calc(20,30);
        System.out.println("result2 = " + result2);

        Calculatable cc3=(n1,n2)->{
            return n1+n2;
        };
        System.out.println("cc3 = " + cc3.calc(100,200));
    }
  }
