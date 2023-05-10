package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Rule {

    public static int getScore(List<Card> cardList) {
        int sum = 0;
        for (int i = 0; i < cardList.size(); i++) {

            switch (cardList.get(i).getDenomination()){
                case "A":
                    sum += 1;
                    break;
                case "J":
                case "Q" :
                case "K":
                    sum += 10;
                    break;
                default:
                    sum +=Integer.parseInt(cardList.get(i).getDenomination());

            }
        }
     return sum;
    }
    public static void whoIsWin(Gamer g, Dealer d) {

    }


}
