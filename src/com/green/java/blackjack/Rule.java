package com.green.java.blackjack;

import java.util.List;

public class Rule {
    static final int BLACKJACK_SOCRE = 21;

    public static int getScore(List<Card> cardList) {
        int sum = 0;
        for (Card c : cardList) {
            sum += getDenominationToNum(c);
        }
        return sum;
    }

    private static int getDenominationToNum(Card c) {
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

    public static void whoIsWin(User gamer, User dealer) {
        int gPoint = gamer.getPointSum();
        int dPoint = dealer.getPointSum();

        if (gPoint <= BLACKJACK_SOCRE && (gPoint > dPoint || dPoint > BLACKJACK_SOCRE)) {
            System.out.println("게이머승리");
        } else if (dPoint <= BLACKJACK_SOCRE && (dPoint > gPoint || gPoint > BLACKJACK_SOCRE)) {
            System.out.println("딜러승리");
        } else {
            System.out.println("무승부");
        }
    }
}





