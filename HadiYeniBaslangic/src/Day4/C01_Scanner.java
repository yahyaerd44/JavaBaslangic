package Day4;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //Scanner Class'ı ile kullanıcıdan veri almak

        Scanner scan =new Scanner(System.in);
        System.out.println("lütefen isminiz yazınız");

        String isim =scan.next();

        System.out.println("lütefen yaınız girin");
        int yasınız=scan.nextInt();

        System.out.println("İsminiz : " + isim);
        System.out.println("Yaşınız : " + yasınız);

    }
}
