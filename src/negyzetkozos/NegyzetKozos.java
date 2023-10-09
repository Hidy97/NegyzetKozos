package negyzetkozos;

public class NegyzetKozos {
    
    public static void main(String[] args) {
        //Családi Alexandra
        //Dreilinger Maja
        //NegyzetKozos.feladat();
        new NegyzetKozos().feladat();
    }
    
    private static void feladat() {

        Negyzet negyzet = new Negyzet(4, new Koordinata(7, 3));
        //Koordinata koord = new Koordinata();
        negyzet.setA(3);
        //koord.setX(5);
        //koord.setY(8);
        //negyzet.setKoord(koord);
        negyzet.allapot();
    }
}
