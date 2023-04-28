package Day8;

import java.util.Scanner;

public class C08_Pratik {

    public static void main(String[] args) {
        /*
        kullanıcıdan console bir metin girmesini isteyelim.
        girilen metinde kaç cümle,
        kaç tane kelime, kaç tane karekter olduğunu gösteren bir program yazınız
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("lütefen bir makale giriniz");
        String makale =scan.nextLine();

        String[] cumleler=makale.split("\\.");
        String[] kelimeler=makale.split(" ");
        String[] karekterler=makale.split("");




        System.out.println("cümle sayısı: "+cumleler.length);// cümle sayısı
        System.out.println("kelime sayısı:"+kelimeler.length);// kelime sayısı
        System.out.println("karekter sayısı:"+karekterler.length);// karekter sayılar
        System.out.println(cumleler[0]);
        System.out.println(cumleler[1]);
        System.out.println(cumleler[2]);





    }
}
