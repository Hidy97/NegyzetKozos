package negyzetkozos;

public class Negyzet {

    public int a;
    public Koordinata koord;
    
    public void allapot(){
        System.out.println("A négyzet: oldala: " + a + ", koordinátái: " + (int)koord.getX() + "," + (int)koord.getY());
    }
    public double terulet() {
        return Math.pow(a, 2);
    }

    public void setA(int a) {
        while (!(a >= 0)) {
            this.a = a;
        }
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
