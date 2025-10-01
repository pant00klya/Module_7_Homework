package Middle_4;

public class Computer {

    public void makeMove(Frog frog2) {
        int steps = (int) (Math.random() * 6) + 1;
        System.out.println("Computer threw the dice and got " + steps + " steps");
        frog2.makeJumps(steps);
    }
}
