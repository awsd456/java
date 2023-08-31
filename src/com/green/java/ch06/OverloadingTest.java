package com.green.java.ch06;

public class OverloadingTest {                 //같은클래스 내에서 메소드이름이같고 매개변수 개수 또는 타입이 달라야한다
    public static void main(String[] args) {
        //sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    }

    public static void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }
    public static void sum(int n1, int n2, long n3) {
        System.out.println(n1 + n2 + n3);
    }
    public static int sum(int k1, int k2, int k3) {
        return k1 + k2 + k3;
    }
}
