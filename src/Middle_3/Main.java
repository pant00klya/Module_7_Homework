package Middle_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computer computer = new Computer();
        PlayerM3 player = new PlayerM3();

        System.out.println("Let's play Rock-Paper-Scissors.");
        System.out.println("1 - Rock. 2 - Paper. 3 - Scissors.");

        int computerPick = computer.randomNumber();

        System.out.println("Make your choice: ");
        int playerPick = scanner.nextInt();

        if (playerPick == computerPick) {
            player.draw();
            System.out.println("computer's pick: " + computerPick);
        } else {
            int result = (playerPick - computerPick + 3) % 3;

            if (result == 1) {
                player.playerWin();
                System.out.println("computer's pick: " + computerPick);
            } else {
                player.computerWin();
                System.out.println("computer's pick: " + computerPick);
            }
        }
    }
}
