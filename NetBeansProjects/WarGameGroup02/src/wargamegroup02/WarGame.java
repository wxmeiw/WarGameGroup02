import java.util.ArrayList;
import java.util.List;

public class WarGame {
    private List<Player> players;

    public WarGame() {
        players = new ArrayList<>();
    }

    public void registerPlayer(Player player) {
        players.add(player);
    }

    //how to compare the cards, update scores, determing the winner
    public void play() {
        
    }

    public void communicateWin(Player player) {
        System.out.println("Congratulations, " + player.getName() 
            + "! You won the game!");
    }

    public void communicateLoss(Player player) {
        System.out.println("Sorry, " + player.getName() 
            + ". You lost the game.");
    }

    public void printPlayerStatus() {
        System.out.println("Player Status:");
        for (Player player : players) {
            System.out.println(player.toString());
        }
    }
}

