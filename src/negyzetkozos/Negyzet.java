package negyzetkozos;

public class Negyzet {

    private int a;
    private  Koord x,y;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a <= 0) {
            this.a = 1;
        }
        this.a = a;
    }

    double terulet() {
        return Math.pow(a, 2);
    }

    Koord xKoord(Koord koordX) {
        return koordX;
    }

    Koord yKoord(Koord koordY) {
        return koordY;
    }

    public String allapot() {
        return "Terület" + terulet() + " oldal hossza: " + a ;      
        //+ " X koordináta: "+  xKoord() + " Y koordinta: " + yKoord(koordY)
    }

}
