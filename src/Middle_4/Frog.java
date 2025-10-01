package Middle_4;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Frog {
    private String name;
    private int jumpCount;
    private static final int TOTAL_JUMPS = 30;

    public Frog(String name) {
        this.name = name;
        this.jumpCount = 0;
    }

    public void makeJumps(int steps) {
        jumpCount += steps;
        System.out.println(name + " made a jump! Total jumps: " + jumpCount);
    }

    public boolean isWinner() {
        return jumpCount >= TOTAL_JUMPS;

    }
}
