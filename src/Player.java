
import java.util.Random;
import java.util.Scanner;

public class Player {
    int playerTotal;
    private String userInput = "";

    public enum Choice {
        HIT, STAY
    }

    public Choice makeChoice() {
        Scanner keyboard = new Scanner(System.in);
        Choice userChoice = null;

        do {
            System.out.println("Would you like to \"hit\" or \"stay?\": ");
            userInput = keyboard.next().trim().toUpperCase();

            switch (userInput) {
            case "HIT":
                userChoice = Choice.HIT;
                break;
            case "STAY":
                userChoice = Choice.STAY;
                break;
            default:
                System.out.print("That option isn't available. ");
                break;
            }
        } while (userChoice == null);
        return userChoice;
    }

    public int applyChoice(Choice userChoice) {

        int mCard;
        Random rand = new Random();
        switch (userChoice) {
        case HIT:
            mCard = rand.nextInt(11 - 2 + 1) + 2;
            playerTotal = playerTotal + mCard;
            System.out.print("The new card is " + mCard + ". ");
            return playerTotal;
        case STAY:
            return playerTotal;

        default:
            System.out.println("Something went wrong.");
            return 0;
        }
    }
}
