package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        Box3<Car> box=new Box3();
        FruitBox<Fruit> fBox=new FruitBox();

        fBox.add(new Fruit());
        fBox.add(new Apple());
        fBox.add(new Grape());

        FruitBox<Apple> aBox=new FruitBox();

    }
}

class Fruit2{
    @Override
    public String toString(){
        return "Fruit";
    }
}

class Apple2 extends Fruit{
    @Override
    public String toString(){
        return "Apple";
    }
}

class Grape2 extends Fruit{
    @Override
    public String toString(){
        return "Grape";
    }
}

class Toy2 {
    @Override
    public String toString(){
        return "Toy";
    }
}

              //여기T가    //Fruit 밑으로만   //여기로들어감
class FruitBox<T extends Fruit> extends Box3<T>{

}



class Box3<T>{
   private List<T> list=new ArrayList<>();


   public void add(T item){
       list.add(item);
   }

   public T get(int idx){
      return list.get(idx);
   }

   public int size(){
     return list.size();
   }

   public String toString(){
       return list.toString();
   }
}
