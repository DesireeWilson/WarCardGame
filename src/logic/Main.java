package logic;

import model.Card;
import model.Deck;
import model.PlayerHand;
import model.Rank;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        PlayerHand playerOne = new PlayerHand("PlayerOne");
        PlayerHand playerTwo = new PlayerHand("PlayerTwo");
        UI ui = new UI();

        //ui.start(deck, playerOne, playerTwo);
        //System.out.println(Rank.SIX.ordinal());
        //System.out.println(Rank.KING.ordinal());
        //System.out.println(deck.getCards().get(0).toString());

    }
}
