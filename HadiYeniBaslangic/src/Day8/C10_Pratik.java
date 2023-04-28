package Day8;

import java.util.Arrays;

public class C10_Pratik {

    public static void main(String[] args) {
        // iki boyutlu array

        int[][] siniflar=new int[2][5];// 2 sınıf var her sınıfta 5 öğrenci var

        // ilk sınııfın notları
        siniflar[0][0]=50;
        siniflar[0][1]=60;
        siniflar[0][2]=70;
        siniflar[0][3]=80;
        siniflar[0][4]=90;

        // 2 sınıfın notları
        siniflar[1][0]=20;
        siniflar[1][1]=30;
        siniflar[1][2]=40;
        siniflar[1][3]=50;
        siniflar[1][4]=60;

        System.out.println(Arrays.toString(siniflar[0]));
        System.out.println(Arrays.toString(siniflar[1]));




    }
}
