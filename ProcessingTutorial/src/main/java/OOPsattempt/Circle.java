package OOPsattempt;

public class Circle {
    private int DIAMETER ;
    private int NO_OF_BALLS;
    private int[] speedOfEachBall;

    public void setDiameterandNoOfBalls(int diameter,int balls) {
        this.DIAMETER = diameter;
        this.NO_OF_BALLS = balls;
    }

    public int[] getDiameterAndNoOfBalls() {
        int DaimeterandNoOFBalls[] = new int[]{this.DIAMETER,this.NO_OF_BALLS};
        return DaimeterandNoOFBalls;
    }

    public void setSpeedOfEachBall(int noOfBalls){
        speedOfEachBall = new int[noOfBalls];
    }

    public int speedThroughX_Axis(int speed)
    {
       speedOfEachBall[speed-1] += speed;
       return speedOfEachBall[speed-1];
    }

    public int positionThroughY_Axis(int positionUnit,int height)
    {
        return (height/5) * positionUnit;
    }
}
