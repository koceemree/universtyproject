package Calisan;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Calisan {
    private String adSoyad;
    private String telefon;
    private String eposta;
    LocalTime myTime = LocalTime.now();
    DateTimeFormatter dtfrm = DateTimeFormatter.ofPattern("HH.mm.a");
    Scanner sc = new Scanner(System.in);


    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }


    public LocalTime getMyTime() {
        return myTime;
    }

    public void setMyTime(LocalTime myTime) {
        this.myTime = myTime;
    }

    public DateTimeFormatter getDtfrm() {
        return dtfrm;
    }

    public void setDtfrm(DateTimeFormatter dtfrm) {
        this.dtfrm = dtfrm;
    }


    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

//    @Override
//    public String toString() {
//        return "Calisan{" +
//                "adSoyad='" + adSoyad + '\'' +
//                ", telefon='" + telefon + '\'' +
//                ", eposta='" + eposta + '\'' +
//                ", myTime=" + myTime +
//                ", dtfrm=" + dtfrm +
//                ", sc=" + sc +
//                '}';
//    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public abstract void giris() ;
  //
    //    }
    public abstract void mesaiSaati();
    public abstract void cikis() ;
//{
//
//        System.out.println(this.adSoyad + "üniversiteden  cikis" + " saat " + dtfrm.format(myTime));
//    }
    public abstract void yemekhane() ;
  //  {
    //        System.out.println(this.adSoyad + " yemekhaneye giriş yaptı. Saat " + dtfrm.format(myTime));
    //    }
}
