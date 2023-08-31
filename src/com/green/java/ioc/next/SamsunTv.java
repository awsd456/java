package com.green.java.ioc.next;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;

public class SamsunTv implements Tv{

    private Speaker speaker;

    public SamsunTv(Speaker speaker){
        this.speaker=speaker;
    }


    @Override
    public void turnOn() {
        System.out.println("삼성tv켜기");
        speaker.volumeUp();
    }


    @Override
    public void turnOff() {
        System.out.println("삼성tv끄기");
        speaker.volumeDown();
    }


}
