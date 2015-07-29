public class Score {

    static String winner = "";

    public static boolean isGameOver(int playerOneTotal, int dealerTotal,
            String playerChoice, String dealerChoice) {
        if (playerOneTotal >= 21 || dealerTotal >= 21) {
            return true;
        } else if (playerChoice.equals("STAY") && dealerChoice.equals("STAY")) {
            return true;
        } else {
            return false;
        }

    }

    public static String pickWinner(int playerOneTotal, int dealerTotal) {
        if (playerOneTotal > 21 && dealerTotal <= 21) {
            winner = "The dealer wins, with a total of " + dealerTotal + ".";
        } else if (playerOneTotal <= 21 && dealerTotal > 21) {
            winner = "You win, with a total of " + playerOneTotal + " vs the dealer's " + dealerTotal;
        } else if (playerOneTotal > dealerTotal) { 
            winner = "You win, with a total of " + playerOneTotal + " vs the dealer's " + dealerTotal;
        } else {
            winner = "The dealer wins, with a total of " + dealerTotal + ".";
        }
        return winner;
    }
    
}

