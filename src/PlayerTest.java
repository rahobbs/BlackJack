import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class PlayerTest {

    @Test
    public void testMakeChoice() {
        fail("Not yet implemented");
    }

    @Test
    public void testIsHit() {
        Player player = new Player();
        assertEquals(player.isHit(Player.Choice.HIT), true);
        assertEquals(player.isHit(Player.Choice.STAY), false);
    }

    @Test
    public void testDrawCard() {
        Player player = new Player();
        Random rand = new Random();
        int total = rand.nextInt(22);
        player.playerTotal = total;
        int card = player.drawCard(true);
        int noCard = player.drawCard(false);

        assertEquals(noCard, 0);
        assertNotEquals(card, 0);
    }

    @Test
    public void testNewTotal() {
        Player player = new Player();

        for (int playerTotal = 0; playerTotal < 22; playerTotal++) {
            for(int newCard= 0; newCard < 12; newCard++){
            player.playerTotal = playerTotal;         
            int newValue = player.newTotal(newCard);
            assertEquals(newValue, playerTotal + newCard);
            }
        }
    }

}
