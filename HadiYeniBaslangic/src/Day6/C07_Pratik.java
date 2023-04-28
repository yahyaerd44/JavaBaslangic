package Day6;

import java.util.Scanner;

public class C07_Pratik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayiyi  giriniz:");
        int s1 =scan.nextInt();
        System.out.println("ikinci sayiyi  giriniz:");
        int s2 =scan.nextInt();
        System.out.println("Ucuncu sayiyi  giriniz:");
        int s3 =scan.nextInt();

        if (s1>=s2 && s1>=s3){
            System.out.println("En Büyük Sayi : "+s1);
        } else if (s2>=s1 && s2>=s3) {
            System.out.println("En Büyük Sayi : "+s2);

        }else if (s3>=s1 && s3>=s2) {
        System.out.println("En Büyük Sayi :" +s3);

    }
    }
}
