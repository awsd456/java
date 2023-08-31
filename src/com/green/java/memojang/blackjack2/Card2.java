package com.green.java.memojang.blackjack2;

public class Card2 {

    private final String[] PATTERN={"♠","♣","♥","♦"};
    private final int MAX_COUNT=13;
    String pattern;
    String denomination;

     Card2(String pattern, String denomination){
        this.pattern=pattern;
        this.denomination=denomination;
    }



    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }
}
