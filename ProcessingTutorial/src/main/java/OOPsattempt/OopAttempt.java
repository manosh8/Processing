package OOPsattempt;
import processing.core.PApplet;

public class OopAttempt extends PApplet{

    ScreenSize ss = new ScreenSize();
    Circle circle = new Circle();

    public static void main(String[] args) {
        PApplet.main("OopAttempt",args);
    }

    @Override
    public void settings() {
        super.settings();
        ss.setWidthAndHeight(800, 600);
        circle.setDiameterandNoOfBalls(10,4);
        circle.setSpeedOfEachBall(circle.getDiameterAndNoOfBalls()[1]);
        size(ss.getWidthAndHeight()[0],ss.getWidthAndHeight()[1]);
    }

    @Override
    public void draw() {
        for(int i = 1; i<=circle.getDiameterAndNoOfBalls()[1] ;i++){
            ellipse(circle.speedThroughX_Axis(i), circle.positionThroughY_Axis(i,ss.getWidthAndHeight()[1]),
                      circle.getDiameterAndNoOfBalls()[0],circle.getDiameterAndNoOfBalls()[0] );
        }
    }
}
