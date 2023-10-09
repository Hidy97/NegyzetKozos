package negyzetkozos;

public class Negyzet {

    private int a;
    private Koordinata koord;

    public Negyzet(int a, Koordinata koord) {
        setA(a);
        this.koord = koord;
    }
    
    
    public void allapot(){
        System.out.println("A négyzet: oldala: " + a + ", koordinátái: " + (int)koord.getX() + "," + (int)koord.getY());
    }
    public double terulet() {
        return Math.pow(a, 2);
    }

    public void setA(int a) {
        if (a <= 0) {
            this.a = 1;
        }
        this.a = a;
    }

    public int getA() {
        return a;
    }
    

    public Koordinata getKoord() {
        return koord;
    }

    public void setKoord(Koordinata koord) {
        this.koord = koord;
    }


    @Override
    public String toString() {
        return "Negyzet{" + "Terület =" + terulet() + "oldal hossza =" + a +'}';

    }
}