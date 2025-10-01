package Middle_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick game mode: ");
        System.out.println("1 - Game with limited attempts (5 attempts only).");
        System.out.println("2 - Game with unlimited attempts.");
        int gameMode = scanner.nextInt();

        boolean limitedMode = (gameMode == 1);
        Player player = new Player(limitedMode);
        Computer computer = new Computer();


        int hiddenNumber = computer.randomNumber();

        if (limitedMode){
            System.out.println("You have 5 attempts to guess the hidden number");
        } else {
            System.out.println("You have unlimited attempts to guess the hidden number");
        }

        while (player.attemptsLeft()) {
            System.out.println("Put in a number from 1 to 10: ");
            int playerNumber = scanner.nextInt();

            if (playerNumber == hiddenNumber) {
                player.correctGuess();
                break;
            } else if (playerNumber < hiddenNumber) {
                player.guessLower();
            } else {
                player.guessHigher();
            }
            if (limitedMode) {
                int remainingAttempts = Player.MAX_ATTEMPTS - player.getAttempts();
                if (remainingAttempts > 0) {
                    System.out.println("You have " + remainingAttempts + " attempts left");
                }
            }
        }
        if (limitedMode && !player.attemptsLeft()) {
            System.out.println("You have no attempts left. Hidden number was: " + hiddenNumber);
        }
        System.out.println("Game over. You made " + player.getAttempts() + " attempts");
    }
}

