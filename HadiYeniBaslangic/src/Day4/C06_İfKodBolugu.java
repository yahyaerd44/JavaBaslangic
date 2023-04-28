package Day4;

import java.util.Scanner;

public class C06_İfKodBolugu {

    public static void main(String[] args) {
        /*
        Kullanıcıdan kilo ve boy bilgisini alıp vucut kütle indexini hesaplayalım
        vke< 18,5
        Zayıfsın, daha fazla yemelisin.

        vke >=18,5 && vke<25
        İdel Kilodasın

        vke >=25 && vke <30
        Kilosun biraz egzersiz yapmalısın

        vke>=30
        obezlik sağlığına dikkat etmelin
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
        float boy=scan.nextFloat();
        System.out.println("lutfen kilonuzu giriniz");
        float kilo =scan.nextFloat();

        float vke=kilo/(boy*boy);

        if ( vke< 18.5){
            System.out.println("Zayıfsın, daha fazla yemelisin.");
        }
        if ( vke >=18.5 && vke<25) {
        }   System.out.println("İdel Kilodasın");

        if (vke >=25 && vke <30){
             System.out.println("Kilosun biraz egzersiz yapmalısın");
         }
        if (vke>=30){
            System.out.println(" obezlik sağlığına dikkat etmelin");
        }
    }
}
