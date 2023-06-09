package com.green.java.blackjack;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class CardDeck {
    public static final String[] PATTERNS = {"♠","♣","♥","♦"};
    public static final int CARD_COUNT = 13;



    private List<Card> cardList;

    public CardDeck() {
        this.cardList = new ArrayList<>();

//        for (int i = 0; i < PATTERNS.length; i++) {
//            for (int j = 0; j <CARD_COUNT; j++) {
//
//                cardList.add(j,PATTERNS[i]);
//
//            }
//        }
        for (String pattern : PATTERNS) {
            for (int i = 0; i < CARD_COUNT; i++) {
                this.cardList.add(new Card(pattern, getDenomination(i)));
            }
        }
    }
    private String getDenomination(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(num);

        }
    }

    public Card getCard() {
        int i = (int)Math.random()*cardList.size()+1;
        Card c = cardList.get(i);
        return cardList.remove(i);
        //this.cardList[i];
    }
    void showSize() {
        System.out.println(cardList.size());
    }
}
