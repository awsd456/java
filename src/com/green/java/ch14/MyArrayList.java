package com.green.java.ch14;

@FunctionalInterface
interface MyConsumer {
    void accept(int num);
}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}

@FunctionalInterface
interface MyFunction2 {
    int apply(int num);
}


public class MyArrayList {

    public int[] arr;

    public MyArrayList() {
        this.arr = new int[0];
    }

    public void add(int val) {
        int[] temp = new int[arr.length + 1];
        temp[arr.length] = val;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public void forEach(MyConsumer consumer) {
        for (int i = 0; i < arr.length; i++) {
            consumer.accept(arr[i]);
        }
    }

    public MyArrayList filter(MyPredicate predicate) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                myArrayList.add(arr[i]);
            }
        }
        return myArrayList;
    }

    public MyArrayList map(MyFunction2 myFunction2) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < arr.length; i++) {
            myArrayList.add(myFunction2.apply(arr[i]));
        }
        return myArrayList;
    }

    public void removeIf(MyPredicate predicate){
        int idx=0;
        int[] temp= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(!predicate.test(arr[i])){
                temp[idx++]=arr[i];
            }
        }
        int[] temp2=new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i]=temp[i];
        }
       arr=temp2;
    }

    public void replaceAll(MyFunction2 myFunction2){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=myFunction2.apply(arr[i]);
        }
    }

    public static MyArrayList asList(int... num){
        MyArrayList myArrayList=new MyArrayList();
        for (int i = 0; i < num.length; i++) {
            myArrayList.add(num[i]);
        }
        return myArrayList;
    }


    @Override
    public String toString() {
        String sum = "[" + arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum + ", " + (arr[i]);
        }

        return String.format(sum + "]");
    }
}
