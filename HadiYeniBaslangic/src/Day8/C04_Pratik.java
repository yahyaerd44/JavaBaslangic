package Day8;

import java.util.Arrays;

public class C04_Pratik {

    public static void main(String[] args) {

        String[] isimler =new String[3];

        isimler[0]="Ayşe";
        isimler[1]="Cansu";
        isimler[2]="Kübra";

        System.out.println(Arrays.toString(isimler));

        System.out.println(isimler[0]);
        System.out.println(isimler[1]);
        System.out.println(isimler[2]);


        int[] sayi=new int[6];

        sayi[0]=12;
        sayi[1]=15;
        sayi[2]=118;
        sayi[3]=112;
        sayi[4]=1123;
        sayi[5]=1123;

        System.out.println(sayi[0]);
        System.out.println(sayi[1]);
        System.out.println(sayi[2]);
        System.out.println(sayi[3]);
        System.out.println(sayi[4]);

        System.out.println(Arrays.toString(sayi));
    }
}

