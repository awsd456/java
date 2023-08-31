package com.green.java.ch12;

public class Box {
    public final static int NUM_MAX=10;
    private Object item;



    public void setItem(Object item) {
        this.item=item;
    }

    public Object getItem(){
        return item;
    }


}
