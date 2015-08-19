import static org.junit.Assert.assertEquals;

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
        assertEquals(Score.isGameOver(over, over, stay, stay), true);
        assertEquals(Score.isGameOver(over, under, stay, stay), true);
        assertEquals(Score.isGameOver(under, over, stay, stay), true);

    }

    @Test
    public void testPickWinner() {
        int higher = 17;
        int lower = 15;
        assertEquals(Score.pickWinner(higher, lower), "player");

        lower = 14;
        higher = 16;
        assertEquals(Score.pickWinner(lower, higher), "dealer");
        
        int over = 22;
        int under = 14;
        
        assertEquals(Score.pickWinner(over, under), "dealer");
        assertEquals(Score.pickWinner(under, over), "player");

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
        int winner = 21;
        int loser = 15;
        
        String playerWins = Score.finalScore(winner, loser);
        String dealerWins = Score.finalScore(loser, winner);
        
        assertEquals(playerWins, "Final Score" + "\n" + "Player One: "
                + winner + "\n" + "Dealer: " + loser);
        assertEquals(dealerWins, "Final Score" + "\n" + "Player One: "
                + loser + "\n" + "Dealer: " + winner);
    }

}
