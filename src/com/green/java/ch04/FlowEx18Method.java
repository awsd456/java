package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {

        gugudan(4);
        gugudan(5);
        System.out.println("-------------------------");
        //arguments 아규먼츠,인수 보내는값
        gugudan(3,7);
        System.out.println("--------------------------");
        gugudan(5,6);
    }

    static void gugudan(int dan){                           //같은 이름의 메소드를 여러개만드는것 오버로딩
                    //인자,파라미터,매개변수
        for (int i = 1; i <10 ; i++) {
            System.out.printf("%d*%d=%d\n",dan,i,dan*i);
        }
    }
    static void gugudan(int sDan,int eDan){
        for (int i = sDan; i <=eDan ; i++) {
            gugudan(i);

            System.out.println();
        }
    }
}

