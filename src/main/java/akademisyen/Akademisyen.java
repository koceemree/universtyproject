package akademisyen;

import Calisan.Calisan;

public abstract class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;
    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
      this.bolum=bolum;
      this.unvan=unvan;
    }

//    @Override
//    public String toString() {
//        return "Akademisyen{" +
//                "bolum='" + bolum + '\'' +
//                ", unvan='" + unvan + '\'' +
//                super.toString() +
//                '}';
//    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad() + " derse girdi. Saat " + getDtfrm().format(getMyTime()));
    }

}
