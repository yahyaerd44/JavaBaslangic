package Day7;

import java.util.Random;
import java.util.Scanner;

public class C01_TernaryKullanimi {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

       System.out.println("lütfen bir sayi giriniz");

        String isim="";

       int sayi =scan.nextInt();
/*
    isim=sayi>40? "ayşe":"nurgül";
        System.out.println(isim);

 */
        // iç içe ternary kullanılabilir

        isim=sayi>50? (sayi>80? "ayşe":"büşra"):("hadi");
        System.out.println(isim);
    }


}
