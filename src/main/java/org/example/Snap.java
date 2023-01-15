package org.example;

import java.util.Scanner;

// subclass of CardGame
public class Snap extends CardGame {
    Commands commands = new Commands();

    boolean matchingWins = false;

    public Snap() {
        super("Snap Game");
    }

    // creates a new deckofcards then shuffles with a message

    public void playGame() {
        createDeck();
        cardsSort(CardSorting.randomShuffle);
        System.out.println("To play the game deal one card, Press Enter:");
        // waits for user input using commands.playerCard
        commands.playerCard();
        Card firstCard = dealCard();
        while (!matchingWins) {
            // if no matches within the current game and cards run out create another deck of cards
            if (getDeckOfCards().size() == 0) {
                createDeck();
                cardsSort(CardSorting.randomShuffle);
            }
            System.out.println("To draw another card press Enter again:");
            commands.playerCard();
            Card newCard = dealCard();
            // check for a win, only a win if two cards match and users types snap
            if (firstCard.getSymbol().equals(newCard.getSymbol())) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("To draw another card press Enter again:");
                String playerInput = scanner.nextLine();
                if (playerInput.equals("snap")) {
                    matchingWins = true;
                    System.out.println("SNAP! YOU WON!");
                } else {
                    // if missed a snap game continues and says you missed a snap
                    System.out.println("Missed Snap! please enter 'snap' to win when you receive a match");
                }
            } else {
                firstCard = newCard;
            }
        }
    }
}



