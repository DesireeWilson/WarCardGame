package view;

import model.PlayerHand;

public class Prompts {
    public void winnerPrompt(PlayerHand player) {
        System.out.println(player.getName() + " wins!!!!!");
    }
}
