package com.green.java.ch14;

@FunctionalInterface
interface MyFunction{
    void run();
}

public class LamdaEx1 {

    static void execute(MyFunction f) {
        f.run();
    }

    public static void main(String[] args) {
        MyFunction mf1 = getMyFunction();
        execute(mf1);
    }


    public static MyFunction getMyFunction() {
        MyFunction mf1 = () -> System.out.println("mf1");
        return mf1;
    }

}
