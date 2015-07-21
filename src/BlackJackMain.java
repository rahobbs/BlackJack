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
            System.out.println("You get a " + playerCard.value
                    + ". Your total is " + playerOneTotal + ".");
            
            if (Score.isGameOver(playerOneTotal, dealerTotal) ==true){
                break;
            }
            
            if (dealerTotal < 16){
            dealerTotal = dealerTotal + dealerCard.value;
            System.out.println("The dealer got a " + dealerCard.value + ".");
            } else{
                System.out.println("The dealer has chosen to stay.");
            }

                        
            System.out.println("Would you like to \"hit\" or \"stay?\"");
            String action = keyboard.next();
        }

        System.out.println("Game over. "
                + Score.pickWinner(playerOneTotal, dealerTotal)
                + " is the winner.");
    }
}
