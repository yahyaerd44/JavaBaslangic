package Day3;

public class C04_LengthMethodu {
    public static void main(String[] args) {

        // length() methodu ile String uzunluğunu öğrenme
        // bir string in kaç karekterden olustugunu grenmek icin Lenght() methodu kullanılır.

        String isim="Hamza";
        String dil ="Java";
        String bilgi="String uzunluğu elde etme";

        System.out.println(isim.length());
        System.out.println(dil.length());
        System.out.println(bilgi.length());

        int isimUzunluk=isim.length();
        int dilUzunluk =dil.length();
        int bilgiUzunluk = bilgi.length();

        System.out.println(isimUzunluk);
        System.out.println(dilUzunluk);
        System.out.println(bilgiUzunluk);

    }



}
