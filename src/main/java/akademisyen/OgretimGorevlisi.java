package akademisyen;

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
}
