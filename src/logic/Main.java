package logic;


import model.Deck;
import model.PlayerHand;
import view.Display;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        PlayerHand playerOne = new PlayerHand("PlayerOne");
        PlayerHand playerTwo = new PlayerHand("PlayerTwo");
        GameLogic gameLogic = new GameLogic(display);

        //deck.shuffleDeck();
        //System.out.println(deck);
        gameLogic.start(deck, playerOne, playerTwo, scanner);
    }
}