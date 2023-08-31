package com.green.java.ch07;

public class PolyArgumentTest2 {
    public static void main(String[] args) {

        Buyer3 b = new Buyer3();
        b.buy(new Tv3());
        b.buy(new Computer3());
        b.buy(new Audio3());
        b.buy(new Audio3());

        b.summary();

        b.printState();
    }
}

class Buyer3 {
    private int money;
    private int bonusPoint;
    private Product3[] items;               //배열은 크기가 정해져있다
    private int idx;

    Buyer3() {
        this.money = 1000;
        this.bonusPoint = 0;
        this.items = new Product3[10];
        this.idx = 0;
    }

    public void buy(Product3 c) {

        items[idx++] = c;

        money -= c.getPrice();
        bonusPoint += c.getBonusPoint();
        System.out.println(c + "를" + c.getPrice() + "만원에 구매하였습니다");
    }

    public void printState() {
        System.out.printf("나의 남은돈은 %d만원 입니다.\n보너스 점수는 %d점 입니다.\n", money, bonusPoint);
    }

    public void summary() {
        System.out.print("구입하신 제품은");
        if (idx > 0) {
            System.out.printf("%s", items[0]);
            for (int i = 1; i < idx; i++) {
                System.out.printf(",%s", items[i]);
            }
        }
        System.out.printf("총 %,d개 입니다\n", idx);
    }
}

class Product3 {
    protected int price;
    protected int bonusPoint;

    Product3(int price) {
        this.price = price;
        this.bonusPoint = (int) (price * 0.1);
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}

class Tv3 extends Product3 {
    public Tv3() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer3 extends Product3 {
    public Computer3() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio3 extends Product3 {
    public Audio3() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}







