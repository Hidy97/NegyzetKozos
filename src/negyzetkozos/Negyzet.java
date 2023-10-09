package negyzetkozos;

public class Negyzet {
    
    public Negyzet(Koord kordinata) {
        setA(a);
        this.kordinata = kordinata;
    }
    
    private int a;
    private Koord kordinata;
    
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
    
    public Koord getKordinata() {
        return kordinata;
    }
    
    public void setKordinata(Koord kordinata) {
        this.kordinata = kordinata;
    }
    
    public String allapot() {
        return "Terület" + terulet() + " oldal hossza: " + a + ", koordináta: " + kordinata.koordAllapot();        
        
    }
    
}
