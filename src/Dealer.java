public class Dealer extends Player {
    
    String userInput = "";

    public Choice dealerChoice(int playerTotal) {



        if (this.playerTotal > 16) {
            userInput = "STAY";
        } else {
            userInput = "HIT";
        }
        switch (userInput) {
        case "HIT":
            return Choice.HIT;
        case "STAY":
            return Choice.STAY;
        default:
            System.out.print("That option isn't available. ");
            return Choice.NONE;
        }
    }

}
