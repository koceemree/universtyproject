import Memur.BilgiIslem;
import Memur.GuvenlikGorevlisi;
import akademisyen.LabAsistan;
import akademisyen.OgretimGorevlisi;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalisanRunner {
    public static int secim;
    static String name;

    public static void main(String[] args) throws IOException {


        anaMenu();


    }

    public static void anaMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(" akademisyen için 1 basınız. Memur için için 2 basınız.");
        try{
            secim = sc.nextInt();
            sec();
        }catch (InputMismatchException e){
            System.out.println("Sadece sayi giriniz.");
            anaMenu();
        }


    }

    public static int sec() throws IOException {

        Scanner scan = new Scanner(System.in);
        while (true) {

try
{
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
            OgretimGorevlisi akd = new OgretimGorevlisi(name, "156545", "exasd", "bilgi", "Docent", "10");
            akd.yemekhane();
            akd.senatoTop();
            akd.giris();

        } else if (secme == b) {
            System.out.println("Asistan sayfamıza hosgeldiniz");
            System.out.println("İsminizi yazınız");
            name = scan.nextLine();
            scan.nextLine();
            LabAsistan akd = new LabAsistan(name, "adasda", "asdasd", "asdasd", "asdasd");
            akd.quizYap();

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
            name = scan.nextLine();
            BilgiIslem blg = new BilgiIslem(name, "156545", "exasd", "bilgi", "Docent", "10");
            blg.networkKurulum();
        } else if (secme == b) {
            System.out.println("Güvenlik gorevlisi sayfamıza hosgeldiniz");
            System.out.println("İsminizi yazınız");
            name = scan.nextLine();
            name = scan.nextLine();
            GuvenlikGorevlisi gv = new GuvenlikGorevlisi(name, "asdasd", "asdasd", "dasdas", "asdasd", "sadasd");
            gv.yemekhane();
            gv.mesaiSaati();
        }
    }else {
        System.out.println("Hatalı giriş yaptınız");
    }


//            System.out.println("Programdan cıkmak için Q basınızBir üst menüye geçmek için E basınız.Ana menüye donmek için R basınız");
//            name = scan.nextLine();
//
//            if (name.equalsIgnoreCase("Q")) {
//                break;
//            } else if (name.equalsIgnoreCase("E")) {
//
//
//            }
    System.out.println("Programdan cıkmak için Q basınızBir üst menüye geçmek için E basınız.Ana menüye donmek için R basınız");


    String name1 = scan.nextLine();




    if (name1.equalsIgnoreCase("Q")) {
        break;
    } else  if (name1.equalsIgnoreCase("E")) {
        sec();
    } else if (name1.equalsIgnoreCase("R")) {
        anaMenu();
    }
}catch (InputMismatchException e){
    System.out.println("Sadece rakam giriniz.");
   sec();
}


        }
        return secim;
    }
}

