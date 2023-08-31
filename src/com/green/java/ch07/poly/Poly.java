package com.green.java.ch07.poly;

/*
다형성,상속관계에서만 의미있음
1.부모타입은 자식 객체주소값 저장할수있다.
2.자식타입은 부모 객체주소값 저장할수없다.
3.타입은 (알고있는메소드만호출할수있음)메소드를 호출할수 있나없나만 결정 > 실제로 실행되는건 객체기준이다.
 */
public class Poly {
    public static void main(String[] args) {
        Animal ani1=new Dog();
        ani1.crying();
        Dog dog1=(Dog)ani1;
        dog1.crying();
    //    ani1.jump();
        dog1.jump();
    }
}
