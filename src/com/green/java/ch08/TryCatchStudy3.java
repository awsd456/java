package com.green.java.ch08;

public class TryCatchStudy3 {
    public static void main(String[] args) {

        int r = div(10, 5);
        System.out.println("r:" + r);
    }

    public static int div(int n1, int n2) {
        int r = 0;
        try {
            r = n1 / n2;
            if (r % 2 == 0) {
                return 100;
            }
        } catch (ArithmeticException | NumberFormatException e2) {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {                          //어떠한 상황에서도 무조건 실행이 보장된다
            System.out.println("파이널리");
        }
        return r;
    }
}
