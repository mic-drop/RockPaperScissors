package rockpaperscissors;

public class GameDuel {
    public static void main(String[] args) {

        // PLAYERS
        Player bruceLee = new Player("Bruce Lee", 0);
        Player mikeTyson = new Player("Mike Tyson", 0);
        Judge  bruceBuffer = new Judge("Bruce Buffer", mikeTyson, bruceLee);


        ///GAME && Variables
        int rounds = 0;
        int bruceLeeHand;
        int mikeTysonHand;
        while (rounds < 10) {
            bruceLeeHand = bruceLee.makeMove();
            mikeTysonHand = mikeTyson.makeMove();
            bruceBuffer.declareWinner(mikeTysonHand, bruceLeeHand);
            rounds++;
        }
        bruceBuffer.declareFinalWinner(mikeTyson.setWins(), bruceLee.setWins());



    }

    }
