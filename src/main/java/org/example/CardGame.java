package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class CardGame {
    private ArrayList<Card> deckOfCards = new ArrayList<Card>(52);
    private final String[] typeOfSuits = {"♥", "♣", "♦", "♠"};
    private final String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};


    public void createDeck() {
        for (String typeOfSuit : typeOfSuits) {
            for (int j = 0; j < symbols.length; j++) {
                deckOfCards.add(new Card(typeOfSuit, symbols[j], value[j]));
            }
        }
//        System.out.println(deckOfCards);

    }

    public CardGame(String name) {
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void cardsSort(CardSorting sortCards) {
        switch (sortCards) {
            case bysuit:
                deckOfCards.sort(new SortDeckIntoSuits());
                break;
            case byvalue:
                deckOfCards.sort(new SortDeckInNumberOrder());
                break;
            case randomShuffle:
                Collections.shuffle(deckOfCards);
                break;
        }
//        for(Card card: deckOfCards ){
//            System.out.println(card);
    }


    public Card dealCard() {
        Card takeOneCard = deckOfCards.get(deckOfCards.size() - 1);
        deckOfCards.remove(deckOfCards.size() - 1);
        System.out.println(takeOneCard);
        return takeOneCard;
        }



}


