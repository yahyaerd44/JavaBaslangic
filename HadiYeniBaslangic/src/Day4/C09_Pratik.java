package Day4;

import java.util.Scanner;

public class C09_Pratik {
    public static void main(String[] args) {
        /*
        Kullanicinin yazmiş olduğu TC kimlik numarasını uygun
        formatta olup olmadığını doğrulayan bir program yazınız
        kural1 : Kimlikn no 0 ile başlayamaz
        kural2 : 11 hane olmalıdır.
        kural3 : son rakam çift olmalıdır
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Kimlik Numarasınızı Giriniz");

        long tcNo=scan.nextLong();
        long ilkHane=tcNo/10000000000l;

        String yaziTc=""+tcNo;
        boolean uzunlukDogruMu=yaziTc.length()==11;

        int sonRakam=(int)(tcNo/10);

        if (ilkHane!=0 && uzunlukDogruMu==true&&sonRakam%2==0){
            System.out.println("tebrik ederim doğru girdiniz");
        }

        if(ilkHane==0){
            System.out.println("ilk hane 0 olamaz");
        }
        if (uzunlukDogruMu==false){
            System.out.println("uzunluk 11 hane olmalı");
        }
        if (sonRakam%2!=0){
            System.out.println("son rakama 2 ile tam bölünmeli");
        }

    }
}
