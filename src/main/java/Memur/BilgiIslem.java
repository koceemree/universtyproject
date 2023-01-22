package Memur;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BilgiIslem extends Memur{
    private String gorev;

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev=gorev;
    }
    public void networkKurulum(){
        System.out.println(this.getAdSoyad() + " " + this.getGorev() + " gorevini yaptı");
    }
    @Override
    public void giris() {
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
