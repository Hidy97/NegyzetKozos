package negyzetkozos;

public class NegyzetKozos {

    public static void main(String[] args) {
        NegyzetKozos.feladat();
    }

    private static void feladat() {
        Negyzet negyzet = new Negyzet();
        Koord koord = new Koord();
        
        koord.setX(3);
        koord.setY(9);        
        negyzet.setA(3);    
        
        //negyzet.yKoord(koord.getY());
        //negyzet.xKoord(koord.getX());
        
        System.out.println(negyzet.allapot());
        

    }
}
