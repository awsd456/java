package com.green.java.memojang;

public class HeroTest {
    public static void main(String[] args) throws InterruptedException {
    Hero h=new Hero("토르",160);
    Hero h1=new Hero("타노스",160);

        h.punch(h1);
        h1.punch(h);
        h1.punch(h);
        h.punch(h1);


    }
}


class Hero{
    String name;
    int hp;

    Hero(String name,int hp){
        this.name=name;
        this.hp=hp;
    }

    void punch(Hero energy) throws InterruptedException {

        System.out.printf("[%s]의 펀치!!!", this.name);
        System.out.printf("%s의 hp:%d->%d\n", energy.name, energy.hp, energy.hp -= 10);
        Thread.sleep(500);
    }
}