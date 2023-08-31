package com.green.java.ch03;

public class OperatorEx24 {
    public static void main(String[] args) {

        //(2>1)&&(3>2)
        //(2>1)&&(3>2)&&(3>=5)
        //(2>1)||(3>2)||(3>=5)

        boolean r1 = (2 > 1) && (3 > 2);                //false 가 될확률이 높은걸 앞쪽에둔다 퍼포먼스가 좋아지기  때문에
        System.out.printf("r1:%b\n", r1);

        boolean r2 = (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r2:%b\n", r2);

        boolean r3 = (2 > 1) || (3 > 2) || (3 >= 5);    //true 가 뜰만한걸 제일 앞쪽에둔다 퍼포먼스가 좋아지기  때문에 // 좌측부분 우선순위
        System.out.printf("r3:%b\n", r3);



    }
}
