public class Score {

    static String winner = "";

    public static boolean isGameOver(int playerOneTotal, int dealerTotal,
            Player.Choice playerOneChoice, Player.Choice dealerChoice) {
        if (playerOneTotal >= 21 || dealerTotal >= 21) {
            return true;
        } else if (playerOneTotal <= 21
                && playerOneChoice == Player.Choice.STAY && dealerTotal <= 21
                && dealerChoice == Player.Choice.STAY) {
            return true;
        } else {
            return false;
        }

    }

    public static String pickWinner(int playerOneTotal, int dealerTotal) {
        if (playerOneTotal <= 21 && dealerTotal < playerOneTotal || playerOneTotal < dealerTotal && dealerTotal > 21) {
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

    public static String finalScore(int playerOneTotal, int dealerTotal) {
        String finalScore = ("Final Score" + "\n" + "Player One: "
                + playerOneTotal + "\n" + "Dealer: " + dealerTotal);
        return finalScore;

    }

}