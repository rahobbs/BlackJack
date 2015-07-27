public class Dealer extends Player{
    
    public Choice makeChoice(int playerTotal) {
        
        String userInput = "";
        
        while (true) {
            if (this.playerTotal > 16){
                userInput = "STAY";
            } else{
               userInput = "HIT";
            }
            switch (userInput) {
            case "HIT":
                return Choice.HIT;
            case "STAY":
                return Choice.STAY;
            default:
                System.out.print("That option isn't available. ");
                continue;
            }
        }
    }
}
