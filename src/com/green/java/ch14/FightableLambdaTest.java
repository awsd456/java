package com.green.java.ch14;

import static com.green.java.ch14.FilghtablaTest.run;

public class FightableLambdaTest {
    public static void main(String[] args) {

        Fightable f1= ()-> {
            System.out.println("크크크");
        };

        run(f1);

        Fightable f2= new Fightable() {
            @Override
            public void punch() {
                System.out.println("가나다라");
            }
        };
        run(f2);
    }
}
