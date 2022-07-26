import processing.core.PApplet;

public class OOPsAttempt extends PApplet{

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final int DIVISOR = 5;
    public static final int DIAMETER = 10;

    public static void main(String[] args) {
        PApplet.main("OOPsAttempt" , args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    int i,j,k,l=0;
    int ball_num=1;
    @Override
    public void draw() {
        getCircle(i,ball_num);
        i++;
        getCircle(j,ball_num+1);
        j+=2;
        getCircle(k,ball_num+2);
        k+=3;
        getCircle(l,ball_num+3);
        l+=4;
    }

    private void getCircle(int speed ,int ball_num) {
        ellipse(speed, (HEIGHT/ DIVISOR) * ball_num, DIAMETER, DIAMETER);

    }
}
