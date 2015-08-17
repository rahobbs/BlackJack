import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ScoreTest {

    @Test
    public void testIsGameOver() {
        boolean isGameOver;
        for (int playerTotal = 0, dealerTotal = 0; playerTotal < 21
                && dealerTotal < 21; playerTotal++, dealerTotal++) {
            isGameOver = Score.isGameOver(playerTotal, dealerTotal,
                    Player.Choice.HIT, Player.Choice.HIT);
            assertEquals(isGameOver, false);
        }

    }

    @Test
    public void testPickWinner() {
        Random rand = new Random();
        int playerTotal = rand.nextInt(22);
        int dealerTotal = rand.nextInt(22);

        if (playerTotal > dealerTotal && playerTotal < 22) {
            String player = Score.pickWinner(playerTotal, dealerTotal);
            assertEquals(player, "player");
        } else {
            String dealer = Score.pickWinner(playerTotal, dealerTotal);
            assertEquals(dealer, "dealer");
        }

    }

    @Test
    public void testReportWinner() {

        String dealerWins = Score.reportWinner("dealer");
        String playerWins = Score.reportWinner("player");

        assertEquals(dealerWins, "The dealer wins! ");
        assertEquals(playerWins, "You win! ");
    }

    @Test
    public void finalScore() {
        fail("Not yet implemented");
    }

}
