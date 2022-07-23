package WarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class War {

    Player playerFirst;
    Player platerSecond;

    List<Card> deck = createDeck();

    public War(Player playerFirst, Player platerSecond) {
        this.playerFirst = playerFirst;
        this.platerSecond = platerSecond;
    }

    public List<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }

        }
        Collections.shuffle(deck);
        return deck;
    }

    public List<Card> deckFirst() {
        List<Card> deckFirst = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            deckFirst.add(deck.get(i));
        }
        return deckFirst;
    }

    public List<Card> deckSecond() {
        List<Card> deckSecond = new ArrayList<>();
        for (int i = 26; i < 52; i++) {
            deckSecond.add(deck.get(i));
        }
        return deckSecond;
    }

    public void strongerCard() {
        int count = 0;
        int count2 = 0;
        int remis = 0;
        for (int i = 0; i < 26; i++) {
            if (deckFirst().get(i).rank.getPower() == deckSecond().get(i).getRank().getPower()) {
                remis++;
            }
            if (deckFirst().get(i).rank.getPower() > deckSecond().get(i).getRank().getPower()) {
                count++;
            }
            if (deckFirst().get(i).rank.getPower() < deckSecond().get(i).getRank().getPower()) {
                count2++;
            }
        }
        System.out.println("Gracz nr 1. Zdobył punktów: " + count);
        System.out.println("Gracz nr 2. Zdobył punktów: " + count2);
        System.out.println("Remisów było: " + remis);
    }
}
