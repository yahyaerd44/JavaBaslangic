package Day4;

import java.util.Scanner;

public class C03_Pratik {
    public static void main(String[] args) {
        // kullanıcıdan iki farklı sayı alnız bu iki sayi ile
        // dört farlı işlem yapınız Topma Çıkarma Çarma Bölme

        Scanner input =new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz \nSayi1 \nSayi2");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();

        int toplam=sayi1+sayi2;
        int fark =sayi1-sayi2;
        int carpma =sayi1*sayi2;
        double bolme=sayi1/sayi2;

        System.out.println("Toplama :="+toplam+ "\n Fark :="+fark+ "\n Carpma :="+carpma+ "\nBolme :="+bolme);
    }

}
