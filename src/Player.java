import java.util.Random;
import java.util.Scanner;

public class Player {
    int playerTotal;

    public enum Choice {
        HIT, STAY, NONE
    }

    public Choice makeChoice() {
        Scanner keyboard = new Scanner(System.in);
        Choice userChoice;

        System.out.print("Would you like to \"hit\" or \"stay?\": ");
        String userInput = keyboard.next().trim().toUpperCase();
        // TODO (rachael) Remove this print statement once gameplay bug resolved
        System.out.println("\"" + userInput + "\"");
        switch (userInput) {
        case "HIT":
            userChoice = Choice.HIT;
            break;
        case "STAY":
            userChoice = Choice.STAY;
            break;
        default:
            System.out.print("That option isn't available. ");
            userChoice = Choice.NONE;
            break;
        }
        keyboard.close();
        return userChoice;

    }

    public int applyChoice(Choice userChoice) {

        int mCard;
        Random rand = new Random();
        switch (userChoice) {
        case HIT:
            mCard = rand.nextInt(11 - 2 + 1) + 2;
            playerTotal = playerTotal + mCard;
            System.out.println("You get a " + mCard + ". Your new total is "
                    + playerTotal + ". ");
            return playerTotal;
        case STAY:
            return playerTotal;

        default:
            System.out.println("Something went wrong.");
            return playerTotal;
        }
    }
}
