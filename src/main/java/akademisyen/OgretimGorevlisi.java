package akademisyen;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;
    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
    }

//    @Override !! ne işe yaradığı arastıralacak!!!!!!!!!!!!!!!!!!!!!!!!!!!ONEMLLİİİİİİİİ!!!!!!!!!!!!!!
//    public String toString() {
//        return "OgretimGorevlisi{" +
//                "kapiNo='" + kapiNo + '\'' +
//                super.toString() +
//                '}';
//    }

    public void senatoTop(){

        System.out.println(getAdSoyad() + " Toplantıya katıldı ");

    }

    public void sinavYap(){
        System.out.println(this.getAdSoyad() + "Sınavı yaptı");
    }

    @Override
    public void giris() {
       // System.out.println("LocalTime.now() = " + LocalTime.now());
//        Date day = new Date();
//        day.getDay();
//        System.out.println(day);
       LocalDate ls = LocalDate.of(2023, 01, 22);

        System.out.println(this.getAdSoyad() + "üniversiteye  giriş yaptı saat " + getDtfrm().format(getMyTime()));
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
}
