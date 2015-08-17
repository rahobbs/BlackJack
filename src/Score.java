public class Score {

    static String winner = "";

    public static boolean isGameOver(int playerOneTotal, int dealerTotal,
            Player.Choice playerOneChoice, Player.Choice dealerChoice) {
        if (playerOneTotal >= 21 || dealerTotal >= 21) {
            return true;
        } else if (playerOneChoice == Player.Choice.STAY
                && dealerChoice == Player.Choice.STAY) {
            return true;
        } else {
            return false;
        }

    }

    public static String pickWinner(int playerOneTotal, int dealerTotal) {
        if (playerOneTotal > 21 && dealerTotal <= 21) {
            winner = "dealer";
        } else if (playerOneTotal <= 21 && dealerTotal > 21) {
            winner = "player";
        } else if (playerOneTotal > dealerTotal) {
            winner = "player";
        } else {
            winner = "dealer";
        }
        return winner;
    }

    public static String reportWinner(String winner) {
        if (winner.equals("dealer")) {
            winner = "The dealer wins! ";
        } else {
            winner = "You win! ";

        }
        return winner;
    }

    public static void finalScore(int playerOneTotal, int dealerTotal) {
        System.out.println("Final Score");
        System.out.println("Player One: " + playerOneTotal);
        System.out.println("Dealer: " + dealerTotal);

    }

}