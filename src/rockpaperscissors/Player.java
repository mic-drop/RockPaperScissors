package rockpaperscissors;

public class Player {


    //// PROPERTIES
    public String name;
    public int wins = 0;

    //// CONSTRUCTOR
    Player(String name, int wins){
        this.name = name;
        wins = 0;
    }

    //GETTER
    public String getName() {
        return this.name;
    }

    public int getWins(){
        return this.wins;
    }

    //SETTER
    public  int setWins() {
       return wins++;
    }


    //// METHODS
    public int  makeMove (){
        int moveValue = (int) Math.ceil(Math.random() * 3 -1);
        switch (moveValue){
            case  0:
                Moves.ROCK.getName();
                Moves.ROCK.getValue();
                break;

            case 1:
                Moves.PAPER.getName();
                Moves.PAPER.getValue();
                break;

            case 2:
                Moves.SCISSORS.getName();
                Moves.SCISSORS.getValue();
                break;
        }
        return moveValue;
    }


}
