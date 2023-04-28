package Day8;

import java.util.Arrays;

public class C02_Pratik {
    public static void main(String[] args) {
        /*
        bir array oluşturunuz array içinde 5 tane isim yazınız

        oluşturduğunuz array console yazdırın
         */
        //1.yöntem
        String[] isimler=new String[5];
        isimler[0]="Hamza";
        isimler[1]="Kerem";
        isimler[2]="Veli";
        isimler[3]="Ali";
        isimler[4]="Fatih";

       //2.yöntem
        String[] isim={"Hamza", "Kerem", "Veli", "Ali", "Fatih"};

        int[] sayilar={1,2,3,4,5,6};

        System.out.println(Arrays.toString(sayilar));


        System.out.println(Arrays.toString(isimler));
        System.out.println(Arrays.toString(isim
        ));
    }
}
