package org.example;

import java.util.Comparator;

public class SortDeckIntoSuits implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return o1.getTypeOfSuit().compareTo(o2.getTypeOfSuit());
    }
}
