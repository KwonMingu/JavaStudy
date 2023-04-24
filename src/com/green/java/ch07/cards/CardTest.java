package com.green.java.ch07.cards;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.openCard();
        System.out.println("=========================");
        cd.shuffle();
        cd.openCard();
        System.out.println("========");
        Card c1 = cd.pick();
        System.out.println(c1.kind+","+c1.num);

        cd.openCard();




    }
}
