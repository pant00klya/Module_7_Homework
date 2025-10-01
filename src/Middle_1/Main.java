package Middle_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thimble thimble = new Thimble();
        Player player = new Player();

        Scanner scanner = new Scanner(System.in);

        while (player.getWinCounter() < 3) {
            System.out.println("Put a number of a thimble");
            int answer = scanner.nextInt();
            int realNumber = thimble.showNumberThimble();

            if (answer == realNumber) {
                player.increaseWinCounter();
            } else {
                player.sameWinCounter();
            }
            System.out.println("Your results: " + player.getWinCounter());
        }
    }
}
