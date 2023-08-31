package com.green.java.ch07.poly;

public class PolyAQuiz1 {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new Dog("뽀삐");
        Bulldog bd1=new Bulldog();
        Cat cat1=new Cat();
        Duck duck1=new Duck();

        animalCryingCall(dog1);
        animalCryingCall(bd1);
        animalCryingCall(cat1);
        animalCryingCall(duck1);
    }
    static void animalCryingCall(Animal c){
        c.crying();
        if(c instanceof Dog){
            Dog dog=(Dog)c;
            dog.jump();
        }
    }
}
