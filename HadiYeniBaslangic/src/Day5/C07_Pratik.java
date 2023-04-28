package Day5;

import java.util.Scanner;

public class C07_Pratik {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki kenear uzunluğu girilmesini isteyelim
        girilen kenar uzulukları eşit "Kare" yazsın eşit değilse "Dikdörtgen" yazsın

        not: if else iki if ten daha hızlıdır
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Kısa Kenar Uzunlugu Giriniz :");
        int kısaKenar=scan.nextInt();
        System.out.println("Uzun Kenar Uzunlugu Giriniz :");
        int uzunKenar=scan.nextInt();

        if (uzunKenar==kısaKenar){
            System.out.println("Bu Bir kare");
        }else {
            System.out.println("Bu Bir Dikdörtgen");
        }

    }
}
