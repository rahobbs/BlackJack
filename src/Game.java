import java.util.Random;


public class Game {
    
    Random rand = new Random();
    Player playerOne = new Player();
    Player dealer = new Dealer();
    Player.Choice playerOneChoice;
    Player.Choice dealerChoice;
    
    public static void newGame(){
        
        System.out.println("Welcome to Blackjack!");
        System.out.println("");
    }
    
    public static void initialDraw(){
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
    }
}
