package Day6;

import java.util.Scanner;

public class C02_Pratik {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen hangi gün de olduğunuzu yazınız");

        String gun=scan.next();

        if (gun.equals("pazar")){
            System.out.println("pazar günündedsiniz");
        } else if (gun.equals("cumartesi")) {
            System.out.println("cumartesi günündesini");
        } else if (gun.equals("cuma")) {
            System.out.println("cuma günündesiniz");
        }else { //else kullanmazsada olur
            System.out.println("hafta içindesiniz");
        }


    }
}
