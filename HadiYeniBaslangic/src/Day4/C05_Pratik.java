package Day4;

import java.util.Scanner;

public class C05_Pratik {
    public static void main(String[] args) {

        /*
        Kulanıcıdan vize ve finaltonu isteyiniz ortalamasını hesaplayınız.

         */
        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen vize Notunuzu Giriniz");
        int vizeNotu=scan.nextInt();
        System.out.println("Lutfen Final Notunuzu giriniz");
        int finalNotu=scan.nextInt();

        int hesaplama= vizeNotu*40/100 + finalNotu*60/100;

        System.out.println("Ortalamanız : ==>" +hesaplama);
/*
        if (hesaplama>=50){
            System.out.println("geçti");
        }else{
            System.out.println("kaldı");
        }



 */


    }

}
