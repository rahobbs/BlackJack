import java.util.Random;
import java.util.Scanner;

public class Player {
    int playerTotal;
    String userInput = "";

    public enum Choice {
        HIT, STAY, NONE
    }

    public Choice makeChoice() {
        Scanner keyboard = new Scanner(System.in);
        Choice userChoice;

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
            userChoice = makeChoice();
            break;
        }
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
