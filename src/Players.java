import java.util.Random;
import java.util.Scanner;

public class Players {

    public enum Choice {
        HIT, STAY
    }

    public static Choice makeChoice() {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Would you like to \"hit\" or \"stay?\"");
            String userInput = keyboard.next().trim().toUpperCase();
            switch (userInput) {
            case "HIT":
                return Choice.HIT;
            case "STAY":
                return Choice.STAY;
            default:
                System.out.print("That option isn't available.");
                continue;
            }
        }
    }

    public int applyChoice(Choice userChoice, int playerOneTotal) {
        int mCard;
        Random rand = new Random();
        switch (userChoice) {
        case HIT:
            mCard = rand.nextInt(11 - 2 + 1) + 2;
            playerOneTotal = playerOneTotal + mCard;
            return playerOneTotal;
        case STAY:
            mCard = 0;
            return mCard;
        default:
            mCard = 0;
            return 0;
        }
    }
    
    public void uselessMethod() {
        applyChoice(Choice.HIT, 0);
    }
}
