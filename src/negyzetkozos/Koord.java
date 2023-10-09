package negyzetkozos;

public class Koord {

    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String koordAllapot() {
        return "x = " + x + ", y = " + y;
    }
}
