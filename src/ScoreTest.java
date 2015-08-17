import static org.junit.Assert.*;

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

        int playerTotal;
        int dealerTotal;

        while (playerTotal > dealerTotal && playerTotal < 22) {
            String player = Score.pickWinner(playerTotal, dealerTotal);

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
    public void finalScore(){
        fail("Not yet implemented");
    }

}
