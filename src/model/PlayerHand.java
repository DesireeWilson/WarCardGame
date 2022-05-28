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
        for (Card card : cards) {
            this.cards.add(card);
        }
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

    public void clearCardsInPlay() {
        cardsInPlay.clear();
    }

    public ArrayList<Card> getCardsInPlay() {
        return cardsInPlay;
    }

    public boolean outOfCards() {
        return this.getCards().size() == 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
