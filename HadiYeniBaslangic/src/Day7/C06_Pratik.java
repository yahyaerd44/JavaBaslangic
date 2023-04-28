package Day7;

import java.util.Scanner;

public class C06_Pratik {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen sayi1  giriniz");
        int s1=scan.nextInt();
        System.out.println("lütfen sayi2 girinz");
        int s2=scan.nextInt();

        System.out.println("Lütfen işlem Seçiniz \n1:Toplm \n2:Cıkarma\n3:Carpma\n4:Bölme");
        int secim=scan.nextInt();

        switch (secim){
            case 1:
                System.out.println("toplama : "+(s1+s2));
                break;
            case 2:
                System.out.println("Fark : "+(s1-s2));
                break;
            case 3:
                System.out.println("Carpma : "+(s1*s2));
                break;
            case 4:
                System.out.println("Bölme : "+(s1/s2));
                break;
            default:
                System.out.println("lütfen 1, 2, 3, 4 değerlerden herhani birini secin");
                break;
        }
    }
}
