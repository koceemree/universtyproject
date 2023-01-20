package Memur;

import java.util.Scanner;

public class GuvenlikGorevlisi extends Memur {
    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, String belge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge = belge;
    }

    public int nobet() {
        int a = 1, b = 2;
        System.out.println("Akşam işe geliyorsanız 1 gunduz işe geliyorsanız 2 basınız");
        int secim = getSc().nextInt();
        if (secim == a) {
            System.out.println(this.getAdSoyad() + " Sabah saat 08:00 - 20:00 arası nobet tutuyor");
        } else if (secim == b) {
            System.out.println(this.getAdSoyad() + " Akşam saat 20:00 - 08:00");
        }else {
            System.out.println("Hatalı giriş yaptınız.");
        }
        return secim;
    }
}
