package org.example;

public class Card {
    private final String typeOfSuit;
    private final String symbol;
    private final int values;

    //constructor which takes three params
    // e.g Card card1 = new Card("♥", "A", 14);
    public Card(String typeOfSuit, String symbol, int values) {
        this.typeOfSuit = typeOfSuit;
        this.symbol = symbol;
        this.values = values;
    }

    // getters allows CreateDeck to access the values
    public String getTypeOfSuit() {
        return typeOfSuit;
    }

    public int getValues() {
        return values;
    }

    public String getSymbol() {
        return symbol;
    }

// creates the card
    @Override
    public String toString() {
        return "Card[" +
                  typeOfSuit + '\'' +
                 symbol + '\'' +
                 values +
                ']';
    }
}



