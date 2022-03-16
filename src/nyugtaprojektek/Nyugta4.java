package nyugtaprojektek;
/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
*/
public class Nyugta4 {

    public static void main(String[] args) {
      
        vonalak(1);
        //System.out.println("     Nyugta 3");
        System.out.printf("%14s\n", "Nyugta 3");
        vonalak(1);
        
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        kiiratas("Tétel 1",tetel1);
        kiiratas("Tétel 2",tetel2);
        kiiratas("Tétel 3",tetel3);


        vonalak(2);
        
        int osszesen = tetel1 + tetel2 + tetel3;

        kiiratas("Összesen",osszesen);
        
        vonalak(3);
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        kiiratas("Szervízdíj",szervizDij);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        vonalak(2);
        
        //int fizetendo = osszesen - szervizDij;
        int fizetendo = osszesen + szervizDij;
        //System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        kiiratas("Fizetendő",fizetendo);
        double euro = fizetendo / 350.0;
        //HUF = "\u20ac";//EZ NEM JÓ!!!!
        final String eur = "\u20ac";
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        vonalak(2);
        
        System.out.println("");
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
        vonalak(1);   
        System.out.println("        CÉG");
        vonalak(1);
    }

    static void vonalak(int adat){
        if (adat == 1){
            System.out.println("********************");
        }else if (adat == 2){
            System.out.println("====================");
        }else if (adat == 3){
            System.out.println("--------------------");
        }
    }
    static void kiiratas(String adat, int adat1){
        final String HUF = "Ft";
        System.out.printf("%10s: %5d %s\n", adat, adat1, HUF);
    }
}
