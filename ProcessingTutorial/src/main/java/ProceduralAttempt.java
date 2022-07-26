import processing.core.PApplet;
public class ProceduralAttempt extends PApplet {
    public static void main(String[] args) {
        PApplet.main("ProceduralAttempt", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(800, 600);
    }

    int i,j,k,l=0;

    @Override
    public void draw() {
        ellipse(i, 600/5, 10, 10);
        i++;
        ellipse(j, (600/5)*2, 10, 10);
        j+=2;
        ellipse(k, (600/5)*3, 10, 10);
        k+=3;
        ellipse(l, (600/5)*4, 10, 10);
        l+=4;
    }
}
