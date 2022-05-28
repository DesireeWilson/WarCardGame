package view;

import model.PlayerHand;

public class Display {

    public void menuPrompt() {
        System.out.println("Press [P] key to play a card\n" +
                           "Press [L] key to see your cards\n" +
                           "Press [Q] key to quit game");
    }

    public void gameWinnerPrompt(String playerName) {
        System.out.println(playerName + " wins the game!!!!!");
    }

    public void matchWinnerPrompt(String playerName) {
        System.out.println(playerName + " won that match!");
    }

    public void displayPlayerCard(String playerName, String card) {
        System.out.println(playerName + ": " + card);
    }

    public void gameOverPrompt() {
        System.out.println("Game Over. Thanks for playing! :) ");
    }

    public void displayPlayerHand(String playerHand) {
        System.out.println(playerHand);
    }

}
