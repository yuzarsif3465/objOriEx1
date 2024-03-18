package outPutStream;

import java.util.Scanner;

// bu konuda metotlarda tek tek get ile almak yerine sadece sop ile output alabilicegiz
public class Test {
    public static void main(String[] args) {
        /*TumUyeler ogrenci= new TumUyeler("yusuf","zorlu","51545");
        DosyaYazma dosyaYazma= new DosyaYazma();

        dosyaYazma.dosyaOlustur("ogrenciler");
        dosyaYazma.dosyayaOgrenciKaydet(ogrenci);*/

        DosyaYazma dosyaYazma=new DosyaYazma();
        TumUyeler uyeler;
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Elit uye ekleme");
        System.out.println("2- genel uye ekleme");
        System.out.println("3- mail gonderme");
        System.out.println("yapmak istediginiz işlem nedir:");
        int x= sc.nextInt();
        System.out.println("uye ismi: ");
        String a=sc.nextLine();
        System.out.println("uye soyismi: ");
        String b=sc.nextLine();
        System.out.println("uye maili: ");
        String c=sc.nextLine();
        uyeler= new ElitUye(a,b,c);
        dosyaYazma.dosyaOlustur("ElitUye");
        dosyaYazma.dosyayaOgrenciKaydet(uyeler);

    }
}
