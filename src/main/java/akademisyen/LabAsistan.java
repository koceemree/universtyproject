package akademisyen;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LabAsistan extends Asistan {
    public LabAsistan(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta, bolum, unvan);
    }

    @Override
    public void derseGir() {
        System.out.println(this.getAdSoyad() + " Lab asistan derse girdi ");
        int soru = (int) (Math.random() * 3 + 1);
        System.out.println(soru);
        String numSoru = "";
        if (soru == 1) {
            numSoru = "Lorem ipsum 1";
            char ch;
            int i;
            for (i = 0; i <= numSoru.length(); i++) {

            }

            System.out.println("Lorem ipsum 1 ");
            System.out.println("Toplam karakter sayısı : " + i);
        } else if (soru == 2) {
            System.out.println("Lorem ipsum 2 ");
            int i;
            numSoru = "Lorem ipsum 1";
            for (i = 0; i <= numSoru.length(); i++) {

            }


            System.out.println("Toplam karakter sayısı : " + i);
        } else if (soru == 3) {
            System.out.println("Lorem ipsum 3 ");
            int i;
            numSoru = "Lorem ipsum 1";
            for (i = 0; i <= numSoru.length(); i++) {

            }


            System.out.println("Toplam karakter sayısı : " + i);
        }
    }

    public void lablaraGir() {
        System.out.println(this.getAdSoyad() + "laboratuara girdi  " + getOfisFormat().format(getOfisSaati()));
    }

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
        if (girisSaati <= saat && cikisSaati >= saat) {
            if (girisSaati == saat) {
                System.out.println("Mesaiye giriş yaptınız Saat " + getDtfrm().format(getMyTime()));
            } else if (cikisSaati == saat) {
                System.out.println("Mesaiden doğru saatte  cıkıs yaptınız Saat : " + getDtfrm().format(getMyTime()));
            } else if (saat > girisSaati) {
                System.out.println("Mesaiye gec geldiginiz tespit edilmiştir. Saat :" + getDtfrm().format(getMyTime()) + " Giriş yaptınız.");
            }
        } else {
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
        System.out.println("saat " + saat);
        if (saat < 12 || saat > 13) {
            System.out.println("Yemek saati bitmiştir.");
        } else {
            System.out.println(this.getAdSoyad() + " yemekhaneye giriş yaptı. Saat " + getDtfrm().format(getMyTime()));
        }
    }
}
