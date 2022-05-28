package logic;

import model.Card;
import model.Deck;
import model.PlayerHand;

import java.util.ArrayList;

public class UI {
    boolean gameOver = false;

    UI() { }

    void start(Deck deck, PlayerHand p1, PlayerHand p2) {
        deck.shuffleDeck();
        deck.dealHand(p1, p2, 5);
        while (!gameOver) {
            battle(p1, p2);
        }
    }

    void battle(PlayerHand player1, PlayerHand player2) {
        if(player1.outOfCards()){
            System.out.println("PlayerTwo Wins!!!!");
            gameOver = true;
        } else if (player2.outOfCards()) {
            System.out.println("PlayerOne Wins!!!!");
            gameOver = true;
        } else {
            player1.playCard();
            player2.playCard();
            System.out.println(player1 + ": " + player1.retrieveCardInPlay());
            System.out.println(player2 + ": " + player2.retrieveCardInPlay());
            if (player1.retrieveCardInPlay().compareTo(player2.retrieveCardInPlay()) == 1) {
                winnerTakeSpoils(player1, player2);
            } else if(player1.retrieveCardInPlay().compareTo(player2.retrieveCardInPlay()) == -1){
                winnerTakeSpoils(player2, player1);
            } else {
                declareWar(player1, player2);
            }
        }
    }

    void declareWar(PlayerHand player1, PlayerHand player2) {
        if (player1.getCards().size() < 4) {
            System.out.println("PlayerTwo Wins!!!!");
            gameOver = true;
        } else if (player2.getCards().size() < 4) {
            System.out.println("PlayerOne Wins!!!!");
            gameOver = true;
        } else {
            for (int i = 0; i < 4; i++) {
                player1.playCard();
                player2.playCard();
            }
            battle(player1, player2);
        }
    }

    void winnerTakeSpoils(PlayerHand winner, PlayerHand loser) {
        System.out.println(winner + " won that match!");
        ArrayList<Card> allCardsInPlay = new ArrayList<>();
        allCardsInPlay.addAll(winner.getCardsInPlay());
        allCardsInPlay.addAll(loser.getCardsInPlay());
        winner.receiveCards(allCardsInPlay);
        winner.clearCardsInPlay();
        loser.clearCardsInPlay();
        allCardsInPlay = null;
    }
}
