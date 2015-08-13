
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
    
    public boolean isHit(Choice userChoice){
        switch (userChoice){
        case HIT:
            return true;
        default:
            return false;
            }
    }
    
    public int drawCard(boolean isHit){
        if (isHit = true){
            Random rand = new Random();
            int mCard = rand.nextInt(11 - 2 + 1) + 2;
            return mCard;
        } else{
            return 0;
        }
    }
    
    public int newTotal(int newCard){
        if(newCard != 0){
            playerTotal = playerTotal + newCard;
            return playerTotal;
        } else {
            return playerTotal;
        }
    }

}