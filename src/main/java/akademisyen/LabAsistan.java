package akademisyen;

public class LabAsistan extends Asistan{
    public LabAsistan(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta, bolum, unvan);
    }

    @Override
    public void derseGir() {
        System.out.println(this.getAdSoyad() + " Lab asistan derse girdi ");
    }
    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + "laboratuara girdi  " + getOfisFormat().format(getOfisSaati()));
    }
}
