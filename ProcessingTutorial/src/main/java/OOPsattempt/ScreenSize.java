package OOPsattempt;

public class ScreenSize {
    private int HEIGHT;
    private int WIDTH;

    public void setWidthAndHeight(int width,int height)
    {
        this.WIDTH = width;
        this.HEIGHT = height;
    }

    public int[] getWidthAndHeight()
    {
        int width_and_height[]= new int[]{this.WIDTH,this.WIDTH};
        return width_and_height;
    }
}
