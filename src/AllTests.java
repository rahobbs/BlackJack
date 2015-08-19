import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ DealerTest.class, GameTest.class, PlayerTest.class,
        ScoreTest.class })
public class AllTests {

}
