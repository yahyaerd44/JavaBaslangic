package Day7;

import java.util.Scanner;

public class C03_Pratik {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("lütfen Vize Notunuzu Giriniz");
        int vizeNotu=scan.nextInt();
        System.out.println("lütfen Final Notunuzu Giriniz");
        int finalNotu=scan.nextInt();

        int ortalama=vizeNotu*40/100+finalNotu*60/100;

        String harftNotu= ortalama<50? "FF"
                :ortalama<60? "DD"
                :ortalama<70? "CC"
                :ortalama<80? "BB"
                :ortalama<90? "BA" :"AA";

        System.out.println("Öğrenicinin harf Notu :"+harftNotu);


    }
}
