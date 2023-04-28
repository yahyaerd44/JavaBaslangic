package Day9;

public class C06_Pratik {
    public static void main(String[] args) {
        /*
        bir sayının rakamları toplamını while döngüsüyle bulalım..

        int toplam=0;
        int sayi =123;
        int basamak=0;

        int birler=sayi%10;
         sayi=  sayi/10;
         int onlar =sayi%10;
         sayi=sayi/10;
         int yuzler=sayi/10;

         */

        int toplam=0;
        int sayi =987;
        int basamak=0;

        while (sayi>0){

            basamak=sayi%10;
            toplam+=basamak;
            sayi/=10;
        }
        System.out.println("Rakamların toplamı:"+toplam);

    }
}
