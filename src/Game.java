import java.util.Random;

public class Game {

    static Random rand = new Random();
    static Player playerOne = new Player();
    static Player dealer = new Dealer();
    static Player.Choice playerOneChoice;
    static Player.Choice dealerChoice;

    public static String newGame() {

        return "Welcome to Blackjack! \n";
    }

    public static void initialDraw() {
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

    public static void playGame() {
        do {
            playerOneChoice = Game.playerOne.makeChoice();
            dealerChoice = Game.dealer.makeChoice();

            // player one's turn

            Game.playerOne.newTotal(Game.playerOne.drawCard(Game.playerOne
                    .isHit(playerOneChoice)));
            System.out.println("Your total is " + Game.playerOne.playerTotal
                    + ".");
            // check to see if player one's action ended the game
            Score.isGameOver(Game.playerOne.playerTotal,
                    Game.dealer.playerTotal, playerOneChoice, dealerChoice);
            // dealer's turn
            System.out.println("The dealer chose to " + dealerChoice.name()
                    + ". ");
            Game.dealer.newTotal(Game.dealer.drawCard(Game.dealer
                    .isHit(dealerChoice)));

        } while (Score.isGameOver(Game.playerOne.playerTotal,
                Game.dealer.playerTotal, playerOneChoice, dealerChoice) == false);
    }
}
