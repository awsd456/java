package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class User {

    private List<Card> cardList;

    public User() {
        cardList = new ArrayList();
    }

    public void receiveCard(Card c) {
        cardList.add(c);
    }

    public List<Card> openCards() {
        return cardList;
    }
    protected int getPointSum(){
        int sum = 0;
        for (Card c : cardList) {
            sum += getDenominationToNum(c);
        }
        return sum;
    }

    private int getDenominationToNum(Card c) {
        switch (c.getDenomination()) {
            case "A":
                return 1;
            case "J":
            case "Q":
            case "K":
                return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }

    public void showCard(){

        System.out.println("현재 보유 카드 목록");
        for (int i = 0; i < cardList.size(); i++) {
            System.out.printf("Card{%s,%s}\n",cardList.get(i).getPattern(),cardList.get(i).getDenomination());
        }
    }
}


