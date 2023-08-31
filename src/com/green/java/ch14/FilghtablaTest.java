package com.green.java.ch14;

public class FilghtablaTest {

    public static void run(Fightable f) {
        f.punch();
    }

    public static void main(String[] args) {
        StreetFighter streetFighter = new StreetFighter();
        streetFighter.punch();

        run(streetFighter);

        run(new Fightable() {       //익명 클래스 //인터페이스는 객체화를 할수없다
            @Override
            public void punch() {
                System.out.println("머리 박치기를 한다");
            }
        });

        Fightable f1= new Fightable() {
            @Override
            public void punch() {
                System.out.println("가나다라");
            }
        };
    }
}


class StreetFighter implements Fightable {

    @Override
    public void punch() {
        System.out.println("주먹을 날린다.");
    }

}