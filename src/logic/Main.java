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

        //deck.shuffleDeck();
        //deck.dealHand(playerOne, playerTwo, 5);
        //playerTwo.getCards().forEach(System.out::println);
        //System.out.println();
        //playerOne.getCards().forEach(System.out::println);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Card in Play:" + playerTwo.playCard());
//            System.out.println();
//            playerTwo.getCards().forEach(System.out::println);
//        }
        ui.start(deck, playerOne, playerTwo);
        //System.out.println(Rank.SIX.ordinal());
        //System.out.println(Rank.KING.ordinal());
        //System.out.println(deck.getCards().get(0).toString());

    }
}
