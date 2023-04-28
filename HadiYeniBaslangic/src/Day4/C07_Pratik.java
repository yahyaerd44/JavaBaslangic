package Day4;

import java.util.Scanner;

public class C07_Pratik {

    public static void main(String[] args) {
        /*

        Kullacıdan günde kaç çay içtiğini her çaya kaç şaker atığını yılda kÇ KG Şeker tüketiğini bulalım

        not : 1 küp şeker 3 gr
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("bir günde kaç çay içiyorsunuz");
        double bardak =scan.nextDouble();
        System.out.println("bir çay bardağına kaç şeker atıyorsunuz");
        double seker=scan.nextDouble();

        double  yil =bardak*seker*3*365/1000;
        double yil60=bardak*seker*3*365*60/1000;


        if (yil==0){
            System.out.println("Tebrikler, Şeker tüketmeyrek daha sağlıklı yaşacaksınız");

        }
        if (yil>0){
            System.out.println("yılda tüketiniz şeker miktarı kag :==>"+yil);
            System.out.println("60 yilda tükettiğiniz şekre miktarı kg:==>"+yil60);
        }



    }
}
