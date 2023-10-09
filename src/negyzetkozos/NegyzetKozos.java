package negyzetkozos;

public class NegyzetKozos {
    
    public static void main(String[] args) {
        //Családi Alexandra
        //Dreilinger Maja
        //NegyzetKozos.feladat();
        new NegyzetKozos().feladat();
    }
    
    private static void feladat() {

        Negyzet negyzet1 = new Negyzet(4, new Koordinata(7, 3));
        negyzet1.allapot();
        
        //Negyzet negyzet2 = new Negyzet(9, new Koordinata(3, 2));
        //negyzet2.allapot();
        
        Negyzet negyzet2 = new Negyzet(4, new Koordinata(7, 3));
        boolean negyzetEredmeny = negyzet1.osszeHasonlit(negyzet1, negyzet2);;
        System.out.println("Egyformák? " + negyzetEredmeny);
        
    }
}
