package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    Commands commands = new Commands();

    boolean matchingWins = false;

    public Snap() {
        super("Snap Game");
    }

    public void playGame() {
        createDeck();
        cardsSort(CardSorting.randomShuffle);
        System.out.println("To play the game deal one card, Press Enter:");
        commands.playerCard();
        Card firstCard = dealCard();
        while (!matchingWins) {
            if (getDeckOfCards().size() == 0) {
                createDeck();
                cardsSort(CardSorting.randomShuffle);
                System.out.println("To draw another card press Enter again:");
                commands.playerCard();
                Card newCard = dealCard();
                if (firstCard.getSymbol().equals(newCard.getSymbol())) {
                    Scanner scanner = new Scanner(System.in);
                    String playerInput = scanner.nextLine();
                    if (playerInput.equals("snap")) {
                        matchingWins = true;
                        System.out.println("SNAP! YOU WON!");
                    } else {
                        System.out.println("Missed Snap! please enter 'snap' to win when you recieve a match");
                    }
                } else {
                    firstCard = newCard;
                }
            }
        }
    }
}