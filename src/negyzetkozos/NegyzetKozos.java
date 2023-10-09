package negyzetkozos;

public class NegyzetKozos {

    public static void main(String[] args) {
        NegyzetKozos.feladat();
    }

    private static void feladat() {
        Negyzet negyzet = new Negyzet();
        Koord koord = new Koord(); 
        
        koord.setX(6);
        koord.setY(7);                     
        negyzet.setA(3);          
       negyzet.setKordinata(koord);
        System.out.println(negyzet.allapot());        

    }
}
