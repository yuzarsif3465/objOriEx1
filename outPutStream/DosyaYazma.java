package outPutStream;

import java.io.*;

public class DosyaYazma {
    ObjectOutputStream outputStream;
    FileWriter file;
    BufferedWriter bufferedWriter;
    public boolean dosyaOlustur(String dosyaAdı){
        String dosyaYolu= "C:/Users/user/OneDrive/Masaüstü/";
        try {
//            FileOutputStream fileOutputStream= new FileOutputStream(dosyaYolu+dosyaAdı+".txt");
//
//            outputStream = new ObjectOutputStream(fileOutputStream);
             file = new FileWriter(dosyaYolu+dosyaAdı+".txt");
             bufferedWriter = new BufferedWriter(file);


            return true;

        } catch (FileNotFoundException e) {
            System.err.println("FileOutputStream da bir hata oluştu.");
            System.err.println("Hata: "+ e);
        }
        catch (IOException e) {
            System.err.println("ObjectOutputStream da bir hata oluştu. ");
            System.err.println("Hata: "+e);
        }

        return false;
    }
    public void dosyayaOgrenciKaydet(TumUyeler ogrenci){
        // bu kısımda artık tek tek ogrenci bilgilerini alıp yazdırmak yok sadece output alıcaksın
        //bu  bilgileri de ObjectOutput dan alıcaksın objecte ulaşabilmesi için dışarıda objecti tanımlamalısın
        try {
            bufferedWriter.write(ogrenci.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("ogrenci kaydedilirken bir hata oluştu.");
            System.err.println("Hata: "+ e);
        }

    }
    public void dosyaKapama(){
        if(outputStream!=null){
        }
        else{
            try {
                outputStream.close();
            } catch (IOException e) {
                System.err.println("dosyayı kapatırken hata oluştu");
                System.err.println("hata:"+ e);
            }
        }
    }
}
