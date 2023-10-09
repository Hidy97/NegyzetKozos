package negyzetkozos;

public class NegyzetKozos {
    
    public static void main(String[] args) {
        //Családi Alexandra
        //Dreilinger Maja
        NegyzetKozos.feladat();
    }
    
    private static void feladat() {
        Negyzet negyzet = new Negyzet(new Koord(6, 7) , 3); 
           
        
       
        System.out.println(negyzet.allapot());        

    }
}
