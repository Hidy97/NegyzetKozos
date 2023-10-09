package negyzetkozos;

public class Negyzet {
    static int a;
    static double x, y;
    
    double melyikKoordinata(){
        return 3.0;
    }
    
    double terulet(){    
        return Math.pow(a, 2);
    }    

    @Override
    public String toString() {
        return "Negyzet{" + "Terület =" + terulet() + "oldal hossza =" + a +", x=" + x + ", y=" + y + '}';
    }
    
}
