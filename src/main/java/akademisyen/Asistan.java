package akademisyen;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Asistan extends Akademisyen{
   private LocalTime OfisSaati=LocalTime.now();
  private   DateTimeFormatter ofisFormat = DateTimeFormatter.ofPattern("HH.mm.a");

    public LocalTime getOfisSaati() {
        return OfisSaati;
    }

    public void setOfisSaati(LocalTime ofisSaati) {
        OfisSaati = ofisSaati;
    }

    public DateTimeFormatter getOfisFormat() {
        return ofisFormat;
    }

    public void setOfisFormat(DateTimeFormatter ofisFormat) {
        this.ofisFormat = ofisFormat;
    }

    public Asistan(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta, bolum, unvan);
    }
    public void quizYap(){
        System.out.println(this.getAdSoyad() + "Sınav yaptı" + getDtfrm().format(getMyTime()));
    }
}
