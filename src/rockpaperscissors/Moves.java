package rockpaperscissors;

public enum Moves {
    ROCK("ROCK",0),
    PAPER("PAPER", 1),
    SCISSORS("SCISSORS", 2);

    private int value;
    public String name;

    ///CONSTRUCTOR
    Moves(String name, int value) {
        this.value = value;
    }

    //// GETTER
    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }
}
