package org.example;

public class Player {
    private String currentPlayer;

    public Player() {
        currentPlayer = "Player 1";
    }

    public void switchPlayer() {
        if (currentPlayer.equals("Player 1")) {
            currentPlayer = "Player 2";
        } else {
            currentPlayer = "Player 1";
        }
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }
}