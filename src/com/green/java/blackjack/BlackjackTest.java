package com.green.java.blackjack;

import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {


        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        for (int i = 0; i < 1; i++) {
            gamer.receiveCard(cd.getCard());
            gamer.receiveCard(cd.getCard());
        }
        if (dealer.isReceiveCard()) {
            dealer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }
        gamer.showCards();
        Scanner sc = new Scanner(System.in);
        System.out.println("--------딜러 카드-----------");
        dealer.showCards();

        while (true){
            System.out.println("Card More?y/n");
            String answer = sc.nextLine();
            if("n".equals(answer.trim().toLowerCase())){break;}
            gamer.receiveCard(cd.getCard());
            gamer.showCards();
        }


        dealer.showCards();
        Rule.whoIsWin(gamer,dealer);
    }
}

