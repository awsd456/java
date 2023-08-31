package com.green.java.blackjack;

import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }
        if(dealer.isReceiveCard()){
            dealer.receiveCard(cd.getCard());
        }

        System.out.println("Card More?(y/n)>");
        while (true) {
            String s = scan.nextLine();
            if (s.equals("y")) {
                gamer.receiveCard(cd.getCard());
                gamer.showCard();
            } else if (s.equals("n")) {
                break;
            }
        }

        Rule.whoIsWin(gamer,dealer);

  //     Card c1=cd.getCard();
  //     System.out.println(c1.toString());

 //     System.out.println("------------------");
 //     gamer.receiveCard(cd.getCard());
 //     gamer.receiveCard(cd.getCard());
//
 //     dealer.receiveCard(cd.getCard());
//
 //     dealer.receiveCard(cd.getCard());
//

 // gamer.showCard();
 // System.out.println("======================");
 //   dealer.showCard();
//
 // System.out.println("-----------");
 // for(Card c : gamer.openCards()) {
 //     System.out.println(c.getDenomination());
 // }
 //   System.out.println("-----------");
    int gamerScore = rule.getScore(gamer.openCards());
    System.out.println("gamerScore : " + gamerScore);
    int dealerScore = rule.getScore(dealer.openCards());
    System.out.println("dealerScore : " + dealerScore);

    }
}



