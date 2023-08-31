package com.green.java.ch08;

public class TryCatchStudy2 {
    public static void main(String[] args) {

        String str = "123";

        try {
            int r1 = 10 / 1;                        //ArithmeticException   에러발생  //수학연산 에러
            int num = Integer.parseInt(str);
            System.out.println("num:" + num);       //NumberFormatException 에러발생  //문자열을 숫자로변형 에러
        }catch (ArithmeticException e){
            System.out.println("숫자 예외 발생");
        }
        catch (NumberFormatException e){
            System.out.println("넘버포맷 예외 발생");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외발생");
        } finally {
            System.out.println("파이널리");
        }
        System.out.println("끝");
    }
}
