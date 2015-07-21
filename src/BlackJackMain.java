import java.util.*;

public class BlackJackMain {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Blackjack!");
        System.out.println("");

        // initial draw, create playerCardOne, playerCardTwo, dealerCardOne,
        // dealerCard2
        Card playerCardOne = new Card();
        Card playerCardTwo = new Card();
        int playerOneTotal = playerCardOne.value + playerCardTwo.value;
        Card dealerCardOne = new Card();
        Card dealerCardTwo = new Card();
        int dealerTotal = dealerCardOne.value + dealerCardTwo.value;

        System.out.println("You get a " + playerCardOne.value + " and a "
                + playerCardTwo.value + ". Your total is " + playerOneTotal
                + ".");
        System.out.println("The dealer got a " + dealerCardOne.value
                + ". His second card and total are hidden.");

        while (Score.isGameOver(playerOneTotal, dealerTotal) == false) {
            Card playerCard = new Card();
            Card dealerCard = new Card();
            playerOneTotal = playerOneTotal + playerCard.value;
            dealerTotal = dealerTotal + dealerCard.value;

            System.out.println("You get a " + playerCard.value
                    + ". Your total is " + playerOneTotal + ".");
            System.out.println("The dealer got a " + dealerCard.value + ".");
        }

        System.out.println("Game over. "
                + Score.pickWinner(playerOneTotal, dealerTotal)
                + " is the winner.");
    }
}
