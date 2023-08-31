package com.green.java.ch07;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Tv2 tv=new Tv2();
        Computer com=new Computer();
        Buyer buyer=new Buyer();
        buyer.buy(tv);
        buyer.buy(com);


        buyer.printState();

    }
}
class Buyer{
    private int money;
    private int bonusPoint;

    Buyer(){
        this.money=1000;
        this.bonusPoint=0;
        printState();
    }
   public void buy(Product c){
       money -= c.getPrice();
       bonusPoint += c.getBonusPoint();
       System.out.println(c + "를" + c.getPrice() + "만원에 구매하였습니다");
   }

   public void printState(){
       System.out.printf("나의 남은돈은 %d만원 입니다.\n보너스 점수는 %d점 입니다.\n",money,bonusPoint);
    }
}

class Product {
    protected int price;
    protected int bonusPoint;

    Product(int price){
        this.price=price;
        this.bonusPoint=(int)(price*0.1);
    }
    public int getPrice(){
        return price;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }
}

class Tv2 extends Product{
    public Tv2(){
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product {
    public Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}


