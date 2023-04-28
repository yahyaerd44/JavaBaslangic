package Day4;

import java.util.Scanner;

public class C10_Pratik {
    public static void main(String[] args) {
    /*
    kullanıcının girmiş olduğu kullanıcı adı  ve şifre bilgilerini kontrol ederek
    sisteme girşi yapıp yapamadığını söyleyen bir program yazınız
    kullanıcı: admin
    Şifre:123456

     */

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen Kullanıcı adınızı giriniz");
        String userName=scan.next();

        System.out.println("Lütfen Şifresnizi Giriniz");
        String password=scan.next();

        if (userName.equals("admin")&&password.equals("123456")) {
            System.out.println("hoşgeldiniz");
        }
        if(!userName.equals("admin")){
            System.out.println("Kullanıcı Adını Yanlış girdiniz");
        }
        if (!password.equals("123456")){
            System.out.println("Şifrenizi Yanlış Girdiniz");

        }


    }
}
