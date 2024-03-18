package outPutStream;

import java.io.Serializable;
// bu implement sayesinde verileri yazdıdrırken aynı sırada almasını saglar
public class TumUyeler implements Serializable {
    private String adi;
    private String soyadi;
    private String email;


    public TumUyeler(){

    }
    public TumUyeler(String adi, String soyadi, String email){
        this.adi= adi;
        this.soyadi=soyadi;
        this.email=email;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String okulNo) {
        this.email = okulNo;
    }

    @Override
    public String toString() {
        return "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", okulNo='" + email + '\'';
    }
}
