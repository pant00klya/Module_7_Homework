package Middle_2;

public class Player {
    private int attempts = 0;
    private boolean limitedMode;
    public static final int MAX_ATTEMPTS = 5;

    public Player(boolean limitedMode) {
        this.limitedMode = limitedMode;
    }

    public void correctGuess() {
        System.out.println("Your guess is correct. You won!");
        attempts++;
    }
    public void guessLower() {
        System.out.println("Your guess is lower than hidden number");
        attempts++;
    }
    public void guessHigher() {
        System.out.println("Your guess is higher than hidden number");
        attempts++;
    }
    public int getAttempts() {
        return attempts;
    }
    public boolean attemptsLeft() {
        return !limitedMode || attempts < MAX_ATTEMPTS;
    }
}
