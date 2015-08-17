public class BlackJack {

    public static void main(String[] args) {

        Game.newGame();
        Game.initialDraw();
        Game.playGame();

        // declare winner when game is over
        System.out.print(Score.reportWinner(Score.pickWinner(
                Game.playerOne.playerTotal, Game.dealer.playerTotal)));
        Score.finalScore(Game.playerOne.playerTotal, Game.dealer.playerTotal);
    }

}