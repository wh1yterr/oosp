package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class PlayingCardFactory implements com.company.CardFactory {
    private List<String> suits;
    private List<String> ranks;

    public PlayingCardFactory() {
        suits = new ArrayList<String>();
        ranks = new ArrayList<String>();

        suits.add("Черви");
        suits.add("Буби");
        suits.add("Пики");
        suits.add("Крести");

        ranks.add("Туз");
        ranks.add("2");
        ranks.add("3");
        ranks.add("4");
        ranks.add("5");
        ranks.add("6");
        ranks.add("7");
        ranks.add("8");
        ranks.add("9");
        ranks.add("10");
        ranks.add("Валет");
        ranks.add("Дама");
        ranks.add("Король");
    }

    @Override
    public com.company.Card createCard() {
        Random random = new Random();
        int suitIndex = random.nextInt(suits.size());
        int rankIndex = random.nextInt(ranks.size());

        String suit = suits.get(suitIndex);
        String rank = ranks.get(rankIndex);

        return (com.company.Card) new PlayingCard(suit, rank);
    }
}
