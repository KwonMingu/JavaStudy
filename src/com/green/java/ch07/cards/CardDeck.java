package com.green.java.ch07.cards;

public class CardDeck {
    Card[] cards;
    int idx;




    CardDeck() {
        cards = new Card[52];
//        for (int i = 0; i < cards.length; i++) {
//            cards[i] = new Card("    ", "    ");
//
//        }

        int idx = 0;

        for (int i = 0; i < Card.KINDS.length; i++) {
            for (int j = 1; j <= Card.NUM_MAX; j++) {
                String num = null;
                switch (j) {
                    case 1:
                        num = "A";
                        break;
                    case 11:
                        num = "J";
                        break;
                    case 12:
                        num = "Q";
                        break;
                    case 13:
                        num = "K";
                        break;
                    default:
                        num = String.valueOf(j);
                }
                cards[idx++] = new Card(Card.KINDS[i], num);

            }
        }

    }

    void openCard() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }
    void shuffle() {

        for (int i = 0; i < cards.length; i++) {
            int rIdx= (int)(Math.random()* cards.length);
            Card temp = cards[i];
            cards[i]=cards[rIdx];
            cards[rIdx]=temp;
        }

    }
    Card pick() {
        Card temp = cards[idx];
        cards[idx]=null;
        idx++;
        return temp;
    }
}