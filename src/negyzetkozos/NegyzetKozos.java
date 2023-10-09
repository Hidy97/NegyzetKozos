package negyzetkozos;

public class NegyzetKozos {

    public static void main(String[] args) {
        NegyzetKozos.feladat();
    }

    private static void feladat() {
        Negyzet negyzet = new Negyzet();
        negyzet.a = 3;
        negyzet.x = 5;
        negyzet.y = 8;
        System.out.println(negyzet.toString());

    }
}
