
public class Dealer extends Player {
    public Choice makeChoice() {
        if (this.playerTotal > 16) {
            return Choice.STAY;
        } else {
            return Choice.HIT;
        }
    }
}