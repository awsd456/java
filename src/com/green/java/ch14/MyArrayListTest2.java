package com.green.java.ch14;

public class MyArrayListTest2 {
    public static void main(String[] args) {

        MyArrayList mList = new MyArrayList();

        for (int i = 100; i <= 200; i++) {
            mList.add(i);
        }
        IntBox ib = new IntBox();
        mList.forEach(item ->
        {
//           if (item % 2 == 0) {
//               ib.plus(item * 2);
//           } else {
//               ib.p
//               lus((item));
//           }

            ib.plus(item%2==0 ? item*2 : item);
        });
        int sum = ib.getSum();
        System.out.println("sum = " + sum);
    }
}

class IntBox {

    private int sum;

    public void plus(int num) {
        this.sum += num;
    }

    public int getSum() {
        return sum;
    }
}
