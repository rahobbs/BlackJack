import java.util.Scanner;
import java.util.Random;

public class BlackJack {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        String action = "";
        String dealerAction = "";

        System.out.println("Welcome to Blackjack!");
        System.out.println("");

        // initial draw, create playerOne, dealer, initial cards and total

        Player playerOne = new Player();
        Dealer dealer = new Dealer();
        int playerCardOne = rand.nextInt(11 - 2 + 1) + 2;
        int playerCardTwo = rand.nextInt(11 - 2 + 1) + 2;
        playerOne.playerTotal = playerCardOne + playerCardTwo;

        int dealerCardOne = rand.nextInt(11 - 2 + 1) + 2;
        int dealerCardTwo = rand.nextInt(11 - 2 + 1) + 2;
        dealer.playerTotal = dealerCardOne + dealerCardTwo;

        System.out.println("You get a " + playerCardOne + " and a "
                + playerCardTwo + ". Your total is " + playerOne.playerTotal
                + ".");
        System.out.println("The dealer got a " + dealerCardOne
                + ". His second card and total are hidden.");

        // gameplay
        while (Score.isGameOver(playerOne.playerTotal, dealer.playerTotal,
                playerOne.userInput, dealer.userInput) == false) {

            // player one's turn
            playerOne.applyChoice(playerOne.makeChoice());
            System.out.println("Your total is " + playerOne.playerTotal + ".");
            // check to see if player one's action ended the game
            Score.isGameOver(playerOne.playerTotal, dealer.playerTotal, action,
                    dealerAction);
            // dealer's turn
            dealer.dealerChoice(dealer.playerTotal);
            System.out.println("The dealer chose to "
                    + dealer.userInput.toLowerCase() + ". ");
            dealer.applyChoice(dealer.dealerChoice(dealer.playerTotal));

        }

        // declare winner when game is over
        System.out.println(Score.pickWinner(playerOne.playerTotal,
                dealer.playerTotal));
        keyboard.close();

    }

}