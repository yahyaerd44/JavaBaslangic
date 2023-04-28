package Day8;

import java.util.Arrays;

public class C11_Pratik {
    public static void main(String[] args) {
        /*
        2 farklı sınıftaki öğrenci isimlerini içerisinde tutan 2 boyutlu array oluşturunuz
         */

        String[][] sinif=new String[2][5];

        sinif[0][0]="ahmet";
        sinif[0][1]="ali";
        sinif[0][2]="mustafa";
        sinif[0][3]="ali";
        sinif[0][4]="mustafa";


        sinif[1][0]="mina";
        sinif[1][1]="rukiye";
        sinif[1][2]="beşire";
        sinif[1][3]="ali";
        sinif[1][4]="mustafa";


        System.out.println(Arrays.toString(sinif[0]));
        System.out.println(Arrays.toString(sinif[1]));

        System.out.println(sinif[0][3]);


    }
}
