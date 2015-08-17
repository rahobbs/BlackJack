import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
        
        int under = 22;
        int over = 5; 
        Player.Choice hit = Player.Choice.HIT;
        Player.Choice stay = Player.Choice.STAY;
        assertEquals(Score.isGameOver(over, under, hit, hit), true);
        assertEquals(Score.isGameOver(under, over, hit, hit), true);
        assertEquals(Score.isGameOver(under, under, stay, stay), true);

    }

    @Test
    public void testPickWinner() {
        int playerTotal = 17;
        int dealerTotal = 15;
        assertEquals(Score.pickWinner(playerTotal, dealerTotal), "player");

        playerTotal = 14;
        dealerTotal = 16;
        assertEquals(Score.pickWinner(playerTotal, dealerTotal), "dealer");

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
