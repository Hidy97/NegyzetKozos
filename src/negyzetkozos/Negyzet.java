package negyzetkozos;

public class Negyzet {

    private int a;
    private Koordinata koord;

    public Negyzet(int a, Koordinata koord) {
        setA(a);
        this.koord = koord;
    }

    public void allapot() {
        System.out.println("A négyzet: oldala: " + a + ", koordinátái: " + (int) koord.getX() + "," + (int) koord.getY());
    }

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

    public Koordinata getKoordinata() {
        return koord;
    }

    public void setKordinata(Koord kordinata) {
        this.koord = koord;
    }
    
    public boolean osszeHasonlit(Negyzet elsoNegyzet, Negyzet masodikNegyzet){
        boolean egyformakE = false;
        if (elsoNegyzet.getA() == masodikNegyzet.getA()) {
            egyformakE = true;
        }
        
        return egyformakE;
    }

    @Override
    public String toString() {
        return "Hogy legyen ez is: Negyzet{" + "a=" + a + ", koord=" + koord + '}';
    }

    
}
