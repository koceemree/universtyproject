package akademisyen;

public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;
    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
    }
    public void senatoTop(){
        System.out.println(this.getAdSoyad() + " Toplantıya katıldı ");
    }

    public void sinavYap(){
        System.out.println(this.getAdSoyad() + "Sınavı yaptı");
    }
}
