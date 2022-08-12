import processing.core.PApplet;
public class ProceduralAttempt extends PApplet {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int DIAMETER = 10;
    private static final int noOfBalls = 4;
    private int[] speedOfEachball = new int[noOfBalls];

    public static void main(String[] args) {
        PApplet.main("ProceduralAttempt", args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i = 1; i<= noOfBalls; i++) {
            ellipse(speedThroughX_Axis(i), ballsPositionInY_Axis(i), DIAMETER, DIAMETER);
        }
    }

    private int speedThroughX_Axis(int speed) {
        speedOfEachball[speed-1] += speed;
        return speedOfEachball[speed - 1];
    }

    private int ballsPositionInY_Axis(int positionUnit) {
        return (HEIGHT / 5) * positionUnit;
    }
}
