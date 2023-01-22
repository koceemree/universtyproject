package Memur;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GuvenlikGorevlisi extends Memur {
    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, String belge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge = belge;
    }

//    public int nobet() {
//        int a = 1, b = 2;
//        System.out.println("Akşam işe geliyorsanız 1 gunduz işe geliyorsanız 2 basınız");
//        int secim = getSc().nextInt();
//        if (secim == a) {
//            System.out.println(this.getAdSoyad() + " Sabah saat 08:00 - 20:00 arası nobet tutuyor");
//        } else if (secim == b) {
//            System.out.println(this.getAdSoyad() + " Akşam saat 20:00 - 08:00");
//        }else {
//            System.out.println("Hatalı giriş yaptınız.");
//        }
//        return secim;
//    }

    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + "üniversiteye  giriş yaptı saat " + getDtfrm().format(getMyTime()));
    }


    public void mesaiSaati() {
        LocalTime myTime = LocalTime.now();
        DateTimeFormatter dtfrm = DateTimeFormatter.ofPattern("HH");
        int saat = Integer.parseInt(dtfrm.format(myTime));
        double girisSaati = 08.00;
        double cikisSaati = 17.00;
        if(girisSaati<=saat && cikisSaati>=saat){
          if(girisSaati==saat){
               System.out.println("Mesaiye giriş yaptınız Saat " + getDtfrm().format(getMyTime()));
           }else if(cikisSaati==saat){
               System.out.println("Mesaiden doğru saatte  cıkıs yaptınız Saat : " + getDtfrm().format(getMyTime()));
           }else  if(saat>girisSaati ){
                System.out.println("Mesaiye gec geldiginiz tespit edilmiştir. Saat :" + getDtfrm().format(getMyTime()) + " Giriş yaptınız.");
            }
        }else {
            System.out.println("Mesai gelmediğiniz tespit edilmiştir.");
        }
    }

    @Override
    public void cikis() {
        System.out.println(this.getAdSoyad() + "üniversiteden  cikis" + " saat " + getDtfrm().format(getMyTime()));
    }

    @Override
    public void yemekhane() {
        LocalTime myTime = LocalTime.now();
        DateTimeFormatter dtfrm = DateTimeFormatter.ofPattern("HH");
        int saat = Integer.parseInt(dtfrm.format(myTime));
        System.out.println("saat "+saat);
        if(saat<12 || saat>13){
            System.out.println("Yemek saati bitmiştir.");
        }else {
            System.out.println(this.getAdSoyad() + " yemekhaneye giriş yaptı. Saat " + getDtfrm().format(getMyTime()));
        }
    }
}
