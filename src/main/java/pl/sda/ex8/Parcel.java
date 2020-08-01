package pl.sda.ex8;

public class Parcel {
    private int xLenght;
    private int yLenght;
    private int zLenght;
    private float weigh;
    private boolean isExpress;

    public Parcel(int xLenght, int yLenght, int zLenght, float weigh, boolean isExpress) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        this.zLenght = zLenght;
        this.weigh = weigh;
        this.isExpress = isExpress;
    }

    public int getxLenght() {
        return xLenght;
    }

    public void setxLenght(int xLenght) {
        this.xLenght = xLenght;
    }

    public int getyLenght() {
        return yLenght;
    }

    public void setyLenght(int yLenght) {
        this.yLenght = yLenght;
    }

    public int getzLenght() {
        return zLenght;
    }

    public void setzLenght(int zLenght) {
        this.zLenght = zLenght;
    }

    public float getWeigh() {
        return weigh;
    }

    public void setWeigh(float weigh) {
        this.weigh = weigh;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }
}
