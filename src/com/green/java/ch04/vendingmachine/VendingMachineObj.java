package com.green.java.ch04.vendingmachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachineObj {
    private List<Drink> list = new ArrayList<>();


    public VendingMachineObj() {
        list = new ArrayList<>();
        list.add(new Drink(1000, "콜라", "코카콜라", 500));
        list.add(new Drink(1500, "사이다", "칠성", 450));
        list.add(new Drink(2000, "환타", "코카콜라", 500));
    }

    private int money;

    public void insert(int money) {
        this.money += money;
    }

    public void showMoney() {
        System.out.println("money:" + money);
    }

    public void showMenus() {

        System.out.println("번호\t메뉴명\t가격\t회사\t용량");
        int num = 1;
        for (Drink d : list) {
            System.out.printf("%d. \t %s \t %,d원\t%s\t %,dml\n", num++, d.getNm(), d.getPrice(), d.getCompany(), d.getMl());
        }
    }

    public void purchaseDrink(int x) {
        Drink d = list.get(x - 1);
        System.out.printf("%s를 구매하였습니다.\n", d.getNm());
        this.money -= d.getPrice();

    }
}
