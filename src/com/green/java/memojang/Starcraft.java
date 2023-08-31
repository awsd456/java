package com.green.java.memojang;

public class Starcraft {
    public static void main(String[] args) {
        Medic d = new Medic();
        Marin m=new Marin();
        m.stimpack();
        d.heal(m);
        d.heal(m);

    }
}

class Marin {
      String name;
     int hp;

Marin(){
    this("짐레이너",80);
}
    Marin(String name, int hp) {
        this.name = name;
        this.hp = hp;

    }

    void stimpack() {
        System.out.printf("[%s]의 스팀팩! HP:%d->%d\n", name, hp, hp -= 10);
    }


}

class Medic extends Marin{
    int mp;
    Medic(){
        this(90);
    }
    Medic(int mp){
       super("모랄레스",60);
        this.mp=mp;
    }
    void heal(Marin heal) {

        System.out.printf("[%s]의치유!=>[%s] HP(%d->%d) 남은 mp:%d\n", this.name, heal.name, heal.hp, heal.hp += 10,this.mp -= 10);
    }
}


