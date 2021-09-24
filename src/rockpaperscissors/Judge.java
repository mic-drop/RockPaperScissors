package rockpaperscissors;

public class Judge {

    ///

    ///PROPERTIES
    public String name;
    public Player player1;
    public Player player2;


    //// CONSTRUCTOR
    Judge(String name, Player player1, Player player2) {
        this.name = name;
        this.player1 = player1;
        this.player2 = player2;
    }


    ////METHODS
    public void declareWinner(int moveValue1, int moveValue2) {
        if (moveValue1 == moveValue2) {
            System.out.println("It's a Draw");
        }
        if (moveValue1 == 0 && moveValue2 == 1) {
            player1.setWins();
            System.out.println("MikeTysons Wins with " + Moves.PAPER);
        }
        if (moveValue1 == 1 && moveValue2 == 2) {
            player1.setWins();
            System.out.println("MikeTysons Wins with " + Moves.SCISSORS);
        }
        if (moveValue1 == 2 && moveValue2 == 0) {
            player1.setWins();
            System.out.println("MikeTysons Wins with " + Moves.ROCK);
        }
        if (moveValue1 == 1 && moveValue2 == 0) {
            player2.setWins();
            System.out.println("Bruce Lee Wins with " + Moves.PAPER);
        }
        if (moveValue1 == 2 && moveValue2 == 1) {
            player2.setWins();
            System.out.println("Bruce Lee Wins with " + Moves.SCISSORS);
        }
        if (moveValue1 == 0 && moveValue2 == 2) {
            player2.setWins();
            System.out.println("Bruce Lee Wins with " + Moves.ROCK);
        }
    }
    public void declareFinalWinner(int winPlayer1, int winPlayer2){
        if(winPlayer1 > winPlayer2){
            System.out.println("THE FINAL WINNER IS " + player1.getName() + " with " + player1.getWins() + " wins!");
            System.out.println(player2.getName() + " lost with " + player2.getWins() + " wins.");
        }
        else {
            System.out.println("THE FINAL WINNER IS " + player2.getName() + " with " + player2.getWins() + " wins!");
            System.out.println(player1.getName() + " lost with " + player1.getWins() + " wins.");
        }
    }

}
