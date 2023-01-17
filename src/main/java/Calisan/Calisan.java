package Calisan;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Calisan {
    private String adSoyad;
    private String telefon;
    private String eposta;
    LocalTime myTime=LocalTime.now();
    DateTimeFormatter dtfrm = DateTimeFormatter.ofPattern("HH.mm.a");

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

    public void giris(){
        System.out.println( this.adSoyad + "üniversiteye  giriş yaptı saat " + dtfrm.format(myTime) );
    }
    public void cikis(){

        System.out.println(this.adSoyad + "üniversiteden  cikis" + " saat " + dtfrm.format(myTime));
    }
    public void yemekhane(){
        System.out.println( this.adSoyad +" yemekhaneye giriş yaptı. Saat " + dtfrm.format(myTime) );
    }
}
