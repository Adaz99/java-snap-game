package org.example;

public class Card {
    private final String typeOfSuit;
    private final String symbol;
    private final int values;

    public Card(String typeOfSuit, String symbol, int values) {
        this.typeOfSuit = typeOfSuit;
        this.symbol = symbol;
        this.values = values;
    }

    public String getTypeOfSuit() {
        return typeOfSuit;
    }

    public int getValues() {
        return values;
    }

    public String getSymbol() {
        return symbol;
    }


    @Override
    public String toString() {
        return "Card[" +
                  typeOfSuit + '\'' +
                 symbol + '\'' +
                 values +
                ']';
    }
}



