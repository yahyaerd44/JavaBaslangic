package Day7;

import java.util.Scanner;

public class C04_SwitchCaseKullanimi {

    public static void main(String[] args) {

        /*switch (koşul){
            case 1:
                System.out.println();
        }

         */
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen gün için sayi girin");
        int gun = scan.nextInt();

        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
            System.out.println("yanlış sayi girdiniz");
        }

    }

}
