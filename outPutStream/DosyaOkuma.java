package outPutStream;

import java.io.*;

public class DosyaOkuma {
    ObjectInputStream objectInputStream;
    public boolean dosyayıOku(String dosyaAdı){
        String dosyaYolu="C:/Users/user/OneDrive/Masaüstü/";
        try {
            FileInputStream fileInputStream= new FileInputStream(dosyaYolu+dosyaAdı+".txt");
            objectInputStream= new ObjectInputStream(fileInputStream);
            return true;
        } catch (FileNotFoundException e) {
            System.err.println("okunacak dosya bulunamadı");
            System.err.println("hata: "+e);
        } catch (IOException e) {
            System.err.println("Dosya acılırken bir hata oluştu");
            System.err.println("hata: "+e);
        }
        return false;
    }
    public void dosyaOku(){
        try {// while eklememizin sebebi birden fazla ogrencş alabilmek icindir
            while (true) {
                TumUyeler ogrenci = (TumUyeler) objectInputStream.readObject();
            }
        } catch (EOFException e){
            System.err.println("dosya okuma islemi bitti");
            return;// bunu ekledik ki okuma işlemi bittikten sonra alttakileri hata olarak göstermesin
        }catch (IOException e) {
            System.err.println("ogrenci clası bulunamadı");
            System.err.println("hata: "+ e);
        } catch (ClassNotFoundException e) {
            System.err.println("ogrenci nesnesi okunurken bir hata oluştu");
            System.err.println("hata: "+ e);
        }
    }
    public boolean dosyaOkumaKapat(){
        if(objectInputStream!=null){
            try {
                objectInputStream.close();
            } catch (IOException e) {
                System.err.println("objectOutputStream kapatılırken hata oluştu");
                System.err.println("hata:"+ e);
                return false;
            }
        }
        return true;
    }
}
