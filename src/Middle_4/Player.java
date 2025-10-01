package Middle_4;

public class Player {

    public void makeMove(Frog frog1) {
        int steps = (int) (Math.random() * 6) + 1;
        System.out.println("Player threw the dice and got " + steps + " steps");
        frog1.makeJumps(steps);
    }
}
