
import java.util.Random;

public class BlackJack {

    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("Welcome to Blackjack!");
        System.out.println("");

        // initial draw, create playerOne, dealer, initial cards and total

        Player playerOne = new Player();
        Player dealer = new Dealer();
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

        Player.Choice playerOneChoice;
        Player.Choice dealerChoice;
        // gameplay
        do {
            playerOneChoice = playerOne.makeChoice();
            dealerChoice = dealer.makeChoice();

            // player one's turn
            playerOne.applyChoice(playerOneChoice);
            System.out.println("Your total is " + playerOne.playerTotal + ".");
            // check to see if player one's action ended the game
            Score.isGameOver(playerOne.playerTotal, dealer.playerTotal, playerOneChoice,
                    dealerChoice);
            // dealer's turn
            System.out.println("The dealer chose to "
                    + dealerChoice.name() + ". ");
            dealer.applyChoice(dealerChoice);

        } while (Score.isGameOver(playerOne.playerTotal, dealer.playerTotal,
                playerOneChoice, dealerChoice) == false);

        // declare winner when game is over
        System.out.println(Score.pickWinner(playerOne.playerTotal,
                dealer.playerTotal));
    }

}