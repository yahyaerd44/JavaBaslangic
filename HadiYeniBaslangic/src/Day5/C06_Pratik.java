package Day5;

import java.util.Scanner;

public class C06_Pratik {
    public static void main(String[] args) {
        /*
        Kulanıcıdan bugünün hangi gün olduğunu alın ve eğer gün "cumartesi yada "pazar"
        ise console "hafta sonu" yazdıralım değilse "hafta içi" yazdıralım
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bugün Hangi Gün");
        String gun =scan.next();

        //if (gun.equalsIgnoreCase("cumartesi")||gun.equalsIgnoreCase("pazar")){ yazılabilir.
        
        if (gun.equalsIgnoreCase("cumartesi")||gun.equalsIgnoreCase("pazar")){
            System.out.println("hafta sonu");
        }else{
            System.out.println("hafta içi");
        }


    }
}
