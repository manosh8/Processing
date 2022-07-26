import processing.core.PApplet ;
public class ProcessingExample extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 100;


    public static void main(String[] args) { PApplet.main("TestProcessing" , args);}

    @Override
    public void settings()
    {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
       // ellipse(WIDTH/2,HEIGHT/2,100,100);

    }

    @Override
    public void draw() {
        getBackground();
        getCircle();

    }

    private void getCircle() {
        ellipse(mouseX,mouseY, DIAMETER, DIAMETER);
    }

    private void getBackground() {
        background(255);
    }
}
