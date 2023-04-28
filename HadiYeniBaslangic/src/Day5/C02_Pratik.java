package Day5;

import java.util.Scanner;

public class C02_Pratik {

    public static void main(String[] args) {
        /*
        kullanıcının girmiş olduğu e-mail adresinin doğru olup ollmadığını doğrulayan bir program yazınız
        kural 1 @ işareti içermesi gerekiyor
        kural 2 @ işaretinden sonra gmail.com geçemsi gerekiyor
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen email adresinizi yazınız");
        String email =scan.next();

        int index=email.indexOf("@");
        String gmail=email.substring(index+1);

        if (email.contains("@")==false){
            System.out.println("@ işareti olmadan email adresi yazmayınız");
        }
        if(gmail.equals("gmail.com")==false){
            System.out.println("gmail hesabı giriniz");
        }
        if (email.contains("@")&&gmail.equals("gmail.com")){

            System.out.println("email adresinizi doğru girdiniz");
        }



    }
}
