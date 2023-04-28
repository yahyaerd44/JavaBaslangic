package Day6;

import java.util.Scanner;

public class C04_Pratik {
    public static void main(String[] args) {
        /*
        Kullanıcıya yanına şemsiye alıp almaması gerektiğini söyleyen bir program yazınız

        koşullar
        1. hava yağmurlu olabilir
        2. arabası olabilir
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("araban Varmı ? (true/false) ");
        boolean arabam =scan.nextBoolean();
        System.out.println("Yağmur Yağıyor Mu ? (true/false)");
        boolean yagmur=scan.nextBoolean();

        /*
        if (arabam){
            if (yagmur){
                System.out.println("şemsiyeye gerek yok ama yağmur var");
            }else {
                System.out.println("şemsiyeye gerek yok çünkü yağmur yağmıyor");
            }
        }else {
            if (yagmur){
                System.out.println("şemsiyeye ihtiyacın olacak");
            }else {
                System.out.println("şemsiyeye ihtiyacın olmayacak");
            }
        }
        
         */
        if (arabam&&yagmur) {
            System.out.println("şemsiyeye gerek yok ama yağmur var");
        } else if (arabam&&!yagmur) {
            System.out.println("şemsiyeye gerek yok çünkü yağmur yağmıyor");
        } else if (!arabam&&yagmur) {
            System.out.println("şemsiyeye ihtiyacın olacak");            
        } else if (!arabam&&!yagmur) {
            System.out.println("şemsiyeye ihtiyacın olmayacak");
        }

    }
}
