package Day4;

import java.util.Scanner;

public class C04_Pratik {
    public static void main(String[] args) {

//kulanıcıdan Bir kişinin ayda ve yılda  kaç gün uyuduğunu hesaplama

        Scanner scan =new Scanner(System.in);
        System.out.println(("günde kaç saat uyuyorsunuz ? :"));

        int saat =scan.nextInt();

        int ay =30*saat/24;
        int yil=365*saat/24/30;
        int omur=60*365*saat/24/365;


        System.out.println("Ayda "+ ay+ " Gun uyuyorsunuz");
        System.out.println("yılda "+ yil + " ay uyuyorsunuz");
        System.out.println("omrun boyunca "+ omur + " AY uyuyorsunuz");

    }

}
