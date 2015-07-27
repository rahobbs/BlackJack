public class Score {

    static String winner = "";

    public static boolean isGameOver(int playerOne.playerTotal, int dealer.playerTotal,
            String playerOne.makeChoice(), dealer.makeChoice()) {
        if (playerOne.playerTotal >= 21 || dealer.playerTotal >= 21) {
            return true;
        } else if (playerOne.userInput.equals("STAY") && dealer.userInput.equals("STAY")) {
            return true;
        } else {
            return false;
        }

    }

    public static String pickWinner(int playerOne.playerTotal, int dealer.playerTotal) {
        if (playerOne.playertotal > 21 && dealer.playerTotal <= 21) {
            winner = "The dealer";
        } else if (playerOne.playerTotal <= 21 && dealer.playerTotal > 21) {
            winner = "player one."; // the player
        } else {
            winner = "The dealer, with a total of " + dealerTotal + ".";
        }
        return winner;
    }
