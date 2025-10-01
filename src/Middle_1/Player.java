package Middle_1;

public class Player {
    private int winCounter = 0;

    public void increaseWinCounter() {
        System.out.println("You guessed correctly! Get a point!");
        winCounter++;
    }
    public void sameWinCounter(){
        System.out.println("You guessed incorrectly. No point.");
    }
    public int getWinCounter(){
        return winCounter;
    }
}
