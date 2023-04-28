package Day5;

import java.util.Scanner;

public class C03_Pratik {
    public static void main(String[] args) {
        /*
        Market Alışverişi
        Kullacının almış olduğu ürün miktarı üzerinden yaparak ödemesi gereken toplam tutarı söyleyiniz
        Eğer aldığı üründen

       kural 1 1-10 arası satın aldıysa %10
       kural 1 10-50 arası satın aldıysa %20
       kural 1 50 üzeri arası satın aldıysa %25
         */

        Scanner scan =new Scanner(System.in);

        System.out.println("lütfen ürün fiyatını giriniz");
        float fiyat =scan.nextFloat();
        System.out.println("lütfen ürün miktarını giriniz");
        float miktar=scan.nextFloat();

        float normalFiyat=fiyat*miktar;

        float indirimliFiyat=0.0f;

        if (miktar<10){

            indirimliFiyat=normalFiyat*90/100;
        }
        if ((miktar>10 && miktar<=50)){
            indirimliFiyat=normalFiyat*80/100;
        }
        if (miktar>50){
            indirimliFiyat=normalFiyat*75/100;
        }
        System.out.println("normal fiyat="+normalFiyat);
        System.out.println("indirimli fiyat="+indirimliFiyat);
    }
}
