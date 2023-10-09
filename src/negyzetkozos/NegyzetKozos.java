package negyzetkozos;

public class NegyzetKozos {

    public static void main(String[] args) {
        //Családi Alexandra
        //Dreilinger Maja
        NegyzetKozos.feladat();
    }

    private static void feladat() {
        Negyzet negyzet = new Negyzet();
        Koordinata koord = new Koordinata();
        negyzet.a = 3;
        koord.setX(5);
        koord.setY(8);
        negyzet.setKoord(koord);
        negyzet.allapot();

    }
}
