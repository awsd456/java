package com.green.java.ch07;
/* private,            default,            protected,           public
(해당클래스내에서만)     (같은패키지안에서만)
 */
public class AccessModifier {                   //자바파일명과같은 클래스만 public
    public static void main(String[] args) {    //상수는 public 을 쓴다
        ModifierTest mt1=new ModifierTest();
   //     mt1.num1=10;
        mt1.num2=20;
        mt1.num3=30;
        mt1.num4=40;

    }
}

