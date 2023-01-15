package org.example;

import java.util.Scanner;

// subclass of CardGame
public class Snap extends CardGame {
    Commands commands = new Commands();

    boolean matchingWins = false;
    Player player = new Player();

    public Snap() {
        super("Snap Game");
    }

    // creates a new deckofcards then shuffles
    public void playGame() {
        createDeck();
        cardsSort(CardSorting.randomShuffle);
        // waits for user input using commands.playerCard
        commands.playerCard();
        Card firstCard = dealCard();
        while (!matchingWins) {
            // if no matches within the current game and cards run out create another deck of cards
            if (getDeckOfCards().size() == 0) {
                createDeck();
                cardsSort(CardSorting.randomShuffle);
            }
            System.out.println(player.getCurrentPlayer() + " has drawn a card.");
            commands.playerCard();
            Card newCard = dealCard();
            // check for a win, only a win if two cards match and users types snap
            if (firstCard.getSymbol().equals(newCard.getSymbol())) {
                Scanner scanner = new Scanner(System.in);
                String playerInput = scanner.nextLine();
                if (playerInput.equals("qaz")) {
                    matchingWins = true;
                    System.out.println("SNAP! Player 1 YOU WON!");
                } else if (playerInput.equals("plm")) {
                    matchingWins = true;
                    System.out.println("SNAP! Player 2 YOU WON!");
                } else {
                    // if missed a snap game continues and says you missed a snap
                    System.out.println("Missed Snap! please enter 'qaz' for Player 1 or 'plm' for Player 2 to win when you receive a match");
                }
            } else {
                firstCard = newCard;
                player.switchPlayer();
            }
        }
    }

    // ascii art
    public void displayGameRules() {

// tried to add this not happening
//  .------.
//  |S.--. |
//  | :/\: |
//  | :\/: |
//  | '--'S|
//  `------'
        System.out.println(" _________                        ________                        ");
        System.out.println("/   _____/ ____ _____  ______    /  _____/_____    _____   ____  ");
        System.out.println("\\_____  \\ /    \\\\__  \\ \\____ \\  /   \\  ___\\__  \\  /     \\_/ __ \\ ");
        System.out.println("/        \\   |  \\/ __ \\|  |_> > \\    \\_\\  \\/ __ \\|  Y Y  \\  ___/ ");
        System.out.println("/_______  /___|  (____  /   __/   \\______  (____  /__|_|  /\\___  >");
        System.out.println("        \\/     \\/     \\/|__|             \\/     \\/      \\/     \\/ ");
        System.out.println("Welcome to the Snap Game!");
        System.out.println("The objective of the game is to be the first player to type 'qaz' or 'plm' when two matching cards are drawn.");
        System.out.println("Press Enter to draw a card, type 'qaz' if Player 1 or 'plm' if Player 2 to win when you receive a match.");
        System.out.println("To play the game deal one card, Press Enter:");
    }
}



