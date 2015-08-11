
import static org.junit.Assert.*;

import org.junit.Test;

public class DealerTest {

    @Test
    public void testDealerLogic() {
        Player dealer = new Dealer();
        for(int i = 1; i < 17; i++){
            dealer.playerTotal = i;
            Player.Choice choice1 = dealer.makeChoice();
            assertEquals(Player.Choice.HIT, choice1);
        }
    }
}