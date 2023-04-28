package Day6;

import java.util.Scanner;

public class C06_Pratik {
    public static void main(String[] args) {
        /*
        Kullanıcının girmiş olduğu 2 sayidan büyük olanı bulan bir program yazınız
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayiyi  giriniz:");
        int s1 =scan.nextInt();
        System.out.println("ikinci sayiyi  giriniz:");
        int s2 =scan.nextInt();

        if (s1>s2){
            System.out.println("sayi 1 daha büyük");
        } else if (s2>s1) {
            System.out.println("sayi 2 daha büyük");

        }else {
            System.out.println("sayilar eşit");
        }
    }
}
