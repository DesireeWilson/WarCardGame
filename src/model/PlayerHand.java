package model;

import java.util.ArrayList;

public class PlayerHand {
    String name;
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Card> cardsInPlay = new ArrayList<>();

    public PlayerHand() { }

    public PlayerHand(String name) {
        this.name = name;
    }

    public void receiveCards(ArrayList<Card> cards) {
            this.cards.addAll(cards);
    }

    public void receiveCards(Card card) {
            this.cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card playCard() {
        Card card = this.cards.get(0);
        cardsInPlay.add(card);
        this.cards.remove(card);
        return card;
    }

    public Card retrieveCardInPlay() {
        int lastIndex = this.getCardsInPlay().size() - 1;
        return this.getCardsInPlay().get(lastIndex);
    }

    public void clearCardsInPlay() {
        cardsInPlay.clear();
    }

    public ArrayList<Card> getCardsInPlay() {
        return cardsInPlay;
    }

    public boolean outOfCards() {
        return this.getCards().size() == 0;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
