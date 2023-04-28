package Day6;

import java.util.Scanner;

public class C05_Pratik {
    public static void main(String[] args) {
        /*
        kullanıcının giröiş olduğu vize ve final notunu harf olarak hesaplayan bir program yazınız
        0- 40 ARASI FF
        40-50 ARASI DD
        50-60 ARASI CC
        60-70 ARASI BB
        70-80 ARASI BA
        80-100 ARASI AA
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Vize Notunuzu Giriniz:");
        float vizeNotu =scan.nextFloat();
        System.out.println("final Notunuzu Giriniz:)");
        float finalNotu =scan.nextFloat();
         float ortalama=vizeNotu*40/100+finalNotu*60/100;

         if (ortalama<40){
             System.out.println("Harf Notunuz: FF");
         } else if (ortalama<50) {
             System.out.println("Harf Notunuz: DD");

        } else if (ortalama<60) {
        System.out.println("Harf Notunuz: CC");
        } else if (ortalama<70) {
        System.out.println("Harf Notunuz: BB");
        } else if (ortalama<80) {
             System.out.println("Harf Notunuz: BA");
         }else {
             System.out.println("Harf Notunuz: AA");
         }
    }
}
