import java.util.*;

public class BlackJackMain {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String action = "";
        String dealerAction = "";

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

        while (Score.isGameOver(playerOneTotal, dealerTotal, action, dealerAction) == false) {
            Card playerCard = new Card();
            Card dealerCard = new Card();
           
            
            System.out.println("Would you like to \"hit\" or \"stay?\"");
            action = keyboard.next();
            
            if (action.equals("hit")){
                playerOneTotal = playerOneTotal + playerCard.value;
                System.out.println("You get a " + playerCard.value
                        + ". Your total is " + playerOneTotal + ".");
            }
            
            if (Score.isGameOver(playerOneTotal, dealerTotal, action, dealerAction) ==true){
                break;
            }
            
            if (dealerTotal < 16){
            dealerTotal = dealerTotal + dealerCard.value;
            System.out.println("The dealer got a " + dealerCard.value + ".");
            } else{
                System.out.println("The dealer has chosen to stay.");
                dealerAction = "stay";
            }

        }

        System.out.println("Game over. "
                + Score.pickWinner(playerOneTotal, dealerTotal)
                + " is the winner.");
    }
}
