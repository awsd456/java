package com.green.java.ch04.vendingmachine;

public class VendingMachineObjTest {
    public static void main(String[] args) {
        VendingMachineObj vm=new VendingMachineObj();
        vm.insert(10_000);
        vm.insert(10_000);
        vm.insert(10_000);
        vm.showMoney();

        vm.showMenus();
        vm.purchaseDrink(1);

    }
}
