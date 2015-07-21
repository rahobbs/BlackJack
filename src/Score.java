public class Score {

    static String winner = "";

    public static boolean isGameOver(int playerOneTotal, int dealerTotal, String action, String dealerAction) {
        if (playerOneTotal >= 21 || dealerTotal >= 21) {
            return true;
        } else if (action.equals("stay") && dealerAction.equals("stay")) {
            return true;
        }
        else {
            return false;
        }

    }

    public static String pickWinner(int playerOneTotal, int dealerTotal) {
        if (playerOneTotal > 21 && dealerTotal <= 21) {
            winner = "The dealer";
        } else if (playerOneTotal <= 21 && dealerTotal > 21) {
            winner = "you"; // the player
        } else {
            winner = "The dealer";
        }
        return winner;
    }
}
