package negyzetkozos;

public class Koordinata {
    private double x, y;

    public Koordinata(double x, double y) {
        setX(x);
        setY(y);
    }
    

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
    
}
