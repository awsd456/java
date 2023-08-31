package com.green.java.ioc.prev;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;
public class SamsunTv implements Tv{

    private Speaker speaker;

    public SamsunTv(){
        speaker=new HarmanSpeaker();
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
