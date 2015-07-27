import java.util.Random;
import java.util.Scanner;

public class Player {
    int playerTotal;
    public enum Choice {
        HIT, STAY
    }

    public Choice makeChoice() {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Would you like to \"hit\" or \"stay?\": ");
            String userInput = keyboard.next().trim().toUpperCase();
            switch (userInput) {
            case "HIT":
                return Choice.HIT;
            case "STAY":
                return Choice.STAY;
            default:
                System.out.print("That option isn't available. ");
                continue;
            }
        }
    }

    public int applyChoice(Choice userChoice) {

        int mCard;
        Random rand = new Random();
        switch (userChoice) {
        case HIT:
            mCard = rand.nextInt(11 - 2 + 1) + 2;
            playerTotal = playerTotal + mCard;
            System.out.println("You get a " + mCard + ". Your new total is " + playerTotal + ". ");
            return playerTotal;
        case STAY:
            mCard = 0;
            return playerTotal;
        default:
            mCard = 0;
            return playerTotal;
        }
    }
}
