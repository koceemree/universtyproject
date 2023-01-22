import Memur.BilgiIslem;
import Memur.Memur;
import akademisyen.Akademisyen;
import Memur.GuvenlikGorevlisi;
import akademisyen.Asistan;
import akademisyen.LabAsistan;
import akademisyen.OgretimGorevlisi;

import java.util.Scanner;

public class CalisanRunner {
    public static int secim;
   static String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" akademisyen için 1 basınız. Memur için için 2 basınız.");
        secim = sc.nextInt();


        sec();

    }

    public static int sec() {

      Scanner  scan = new Scanner(System.in);
        int a = 1;
        int b = 2;
        if (secim == a) {
            System.out.println("Oğretim gorevlisi iseniz 1 e Asistansanız 2'ye basınız");
            int secme = scan.nextInt();
            if (secme == a) {
                System.out.println("Ogretim gorevlisi sayfamıza hosgeldiniz");
                System.out.println("İsminizi yazınız");
                name = scan.nextLine();
                name= scan.nextLine();
                OgretimGorevlisi akd = new OgretimGorevlisi( name, "156545", "exasd", "bilgi", "Docent", "10");
                akd.yemekhane();
                akd.senatoTop();
                akd.giris();
            } else if (secme == b) {
                System.out.println("Asistan sayfamıza hosgeldiniz");
                System.out.println("İsminizi yazınız");
                name = scan.nextLine();
                name= scan.nextLine();
                LabAsistan akd = new LabAsistan(name,"adasda","asdasd","asdasd","asdasd");
                akd.derseGir();
            } else {
                System.out.println("Hatalı giriş yaptınız");
            }

        } else if (secim == b) {
            System.out.println("Bilgi işlem gorevlisi iseniz 1 e Güvenlik gorevlisi iseniz 2'ye basınız");
            int secme = scan.nextInt();
            if (secme == a) {
                System.out.println("Bilgi işlem gorevlisi sayfamıza hosgeldiniz");
                System.out.println("İsminizi yazınız");
                name = scan.nextLine();
                name= scan.nextLine();
                BilgiIslem blg = new BilgiIslem(name, "156545", "exasd", "bilgi", "Docent", "10");
                blg.networkKurulum();
            } else if (secme == b) {
                System.out.println("Güvenlik gorevlisi sayfamıza hosgeldiniz");
                System.out.println("İsminizi yazınız");
                name = scan.nextLine();
                name= scan.nextLine();
                GuvenlikGorevlisi gv = new GuvenlikGorevlisi(name, "asdasd", "asdasd", "dasdas", "asdasd", "sadasd");
                gv.getAdSoyad();

                gv.mesaiSaati();
            } else {
                System.out.println("Hatalı giriş yaptınız");
            }


        }

        return secim;
    }

}
