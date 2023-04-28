package Day7;

import java.util.Scanner;

public class C02_Pratik {
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen sayi1  giriniz");
        int s1=scan.nextInt();
        System.out.println("lütfen sayi2 girinz");
        int s2 =scan.nextInt();



        int buyukSayi=s1>s2? s1:s2;

        System.out.println("Büüyük Sayi:"+buyukSayi);

    }
}
