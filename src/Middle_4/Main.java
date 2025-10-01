package Middle_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computer computer = new Computer();
        Player player = new Player();
        Frog frog1 = new Frog("Frog 1");
        Frog frog2 = new Frog("Frog 2");

        System.out.println("Let's play a game called Frogs! The first to make 30 jumps wins.");
        System.out.println("Player has a Frog 1 and goes first.");
        System.out.println("Send 1 to throw the dice.");


        while (!frog1.isWinner() && !frog2.isWinner()) {
            int diceThrow = scanner.nextInt();

            if (diceThrow == 1) {
                player.makeMove(frog1);
                if (frog1.isWinner()) {
                    System.out.println("Congratulations! You won!");
                    break;
                }
                System.out.println("Now, computer's turn.");
                computer.makeMove(frog2);
                if (frog2.isWinner()) {
                    System.out.println("Computer has won!");
                    break;
                }
            } else {
                System.out.println("Please enter 1 to throw a dice.");
            }
            System.out.println("Enter 1 to throw a dice again.");
        }
    }
}
