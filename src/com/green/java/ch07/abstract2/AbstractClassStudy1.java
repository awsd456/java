package com.green.java.ch07.abstract2;

public abstract class AbstractClassStudy1 {     //객체생성 막기위해 abstract를 붙힐수도있다
                                                //abstract는 강제로 구현을 해야된다
    int multi(int n1, int n2) {
        return n1 * n2;
    }

    abstract void sum(int n1, int n2);
}

class ChildClass extends AbstractClassStudy1 {

    @Override
    void sum(int n1, int n2) {
        System.out.println("합계:" + (n1 + n2));
    }
}

class Child2Class extends AbstractClassStudy1 {

    @Override
    void sum(int n1, int n2) {
        System.out.println("sum:" + (n1 + n2));
    }
}
