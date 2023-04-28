package Day5;

import java.util.Scanner;

public class C01_IfScannerBirlikteKullanım {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen secim yapınız");
        String secim=scan.next();

        System.out.println("lütfen sayi1 giriniz");
        int sayi1=scan.nextInt();

        System.out.println("lütfen sayi2 giriniz");
        int sayi2=scan.nextInt();

        if (secim.equals("+")){
            System.out.println("Sayiların Toplamı="+(sayi1+sayi2));
        }
        if (secim.equals("-")){
            System.out.println("Sayiların Farkı="+(sayi1-sayi2));
        }
        if (secim.equals("*")){
            System.out.println("Sayiların Carpımı="+(sayi1*sayi2));
        }
        if (secim.equals("/")){
            System.out.println("Sayiların Bölümü="+(sayi1/sayi2));
        }
    }




}
