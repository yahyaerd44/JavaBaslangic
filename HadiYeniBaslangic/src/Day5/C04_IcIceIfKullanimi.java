package Day5;

import java.util.Scanner;

public class C04_IcIceIfKullanimi {
    public static void main(String[] args) {
        /*
        iç içe if kod bloğunda ilk if bloğu true ise diğer if bloklarına bakar eğer true değilse
        diğer if blokları çalışmaz


        int sayi=80;

        if (sayi>=50){
            System.out.println("sayi 50 den büyük");
            if (sayi%10==0){
                System.out.println("sayi 2 ye tam bölünür");
                if (sayi==70){
                    System.out.println("sayi 70 eşit");
                }
            }
        }


         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas=scan.nextInt();
        System.out.println("lütfen cinsiyetinizi giriniz");
        String cinsiyet=scan.next();

        if (cinsiyet.equals("Erkek")){

            if (yas>=20) {
                System.out.println("askere gidebilir");

            }
            if (yas<20){
                System.out.println("askerlik için yeterli değil");
            }
        }
        }
    }



