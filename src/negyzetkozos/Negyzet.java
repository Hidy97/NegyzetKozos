package negyzetkozos;

public class Negyzet {
    static int oldal = 6;
    static int koordX = 5;
    static int koordY = 3;
    
    public static void allapot(){
        System.out.println("A négyzet oldalának hossza:" + oldal);
    }
    
    public static void terulet(){
        double ter = Math.pow(oldal, oldal);
        
        System.out.println("A négyzet terület: " + ter);
    }
    
    @Override
    public String toString() {
        return "A négyzet állapota{" + "oldal=" + oldal + ", koordX=" + koordX + ", koordY=" + koordY + '}';
    }
    
}
