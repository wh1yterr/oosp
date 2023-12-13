package com.company;

class PlayingCard implements Card {
    private String suit;
    private String rank;

    public PlayingCard(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public void displayCard() {
        System.out.println(rank + " " + suit);
    }
}
