package Day9;

import java.util.Scanner;

public class C07_Pratik {
    public static void main(String[] args) {
        /*
        Kullanıcıdan  bir sayının rakamları toplamını while döngüsüyle bulalım..
         */
        Scanner scan =new Scanner(System.in);

        int sayi=scan.nextInt();
        int toplam=0;
        int basamak=0;

        while (sayi>0){
            basamak=sayi%10;
            toplam+=basamak;
            sayi/=10;

        }
        System.out.println("sayinin rakamlari Toplami:"+toplam);
    }
}
