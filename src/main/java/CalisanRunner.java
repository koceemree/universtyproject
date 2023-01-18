import Memur.BilgiIslem;
import Memur.Memur;
import akademisyen.Akademisyen;


import java.util.Scanner;

public class CalisanRunner {
    static int secim;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" akademisyen için 1 basınız. Memur için için 2 basınız.");
         secim = sc.nextInt();

        sec();
    }

    public static int sec(){
        Scanner sc = new Scanner(System.in);
        int a =1;
        int b=2;
        if(secim == a){
            System.out.println("İsminizi yazınız");
            String name = sc.nextLine();
            Akademisyen akd = new Akademisyen(name,"156545","exasd", "bilgi","Docent");
            akd.derseGir();
        } else if (secim == b) {
            System.out.println("İsminizi yazınız");
            String name = sc.nextLine();
            Memur memur = new Memur(name,"156545","exasd", "bilgi","Docent");
            memur.calis();

        }
        return secim;
    }
}
