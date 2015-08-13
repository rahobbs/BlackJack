import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class PlayerTest {

    @Test
    public void testMakeChoice(){
        fail("Not yet implemented");
    }

    @Test
    public void testIsHit() {
        Player player = new Player();
        assertEquals(player.isHit(Player.Choice.HIT), true);
        assertEquals(player.isHit(Player.Choice.STAY), false);      
    }
    
    @Test
    public void testDrawCard(){
        fail("Not yet implemented");
    }
    
    @Test
    public void testNewTotal(){
        fail("Not yet implemented");
    }

}
