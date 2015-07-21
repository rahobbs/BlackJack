import java.util.Random;

public class Card {

    Random rand = new Random();
    int value = rand.nextInt(11 - 2 + 1) + 2;

}
