
import static org.junit.Assert.*;

import org.junit.Test;

public class DealerTest {

    @Test
    public void testDealerLogic() {
        Player dealer = new Dealer();
        dealer.playerTotal = 300;

        Player.Choice choice1 = dealer.makeChoice();
        assertEquals(Player.Choice.STAY, choice1);
    }
}