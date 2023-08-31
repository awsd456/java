package com.green.java.memojang;

public class DrinkTest {
    public static void main(String[] args) {

        Drink d1 = new Drink();
        d1.name = "포카리";
        d1.price = 1000;
        Drink d2 = new Drink("박카스",800);

        System.out.println(d1.str());
        System.out.println(d2.str());

    }
}

class Drink {

    String name;
    int price;

    Drink(){

    }
    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String str() {
        return String.format("Drink{name:%s,price:%d}", name, price);
    }
}