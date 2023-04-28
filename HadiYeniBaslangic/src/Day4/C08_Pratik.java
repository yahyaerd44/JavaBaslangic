package Day4;

import java.util.Random;

public class C08_Pratik {
    public static void main(String[] args) {
        /*
        rastgele bir sayi üreterek üretilen sayinin hangi aralıkta
        olduğunu consele 'a yazdıran bir program oluşturnuz
        öğrneğin ; rastgele sayi=15
         */
        Random rastgele =new Random();
        int sayi=rastgele.nextInt(100);
        System.out.println(sayi);

        if (sayi<=25){
            System.out.println("sayi 0-25 aralığındadır");
        }
        if (sayi>25&&sayi<=50){
            System.out.println("sayi 25-50 araliğindadir");
        }
        if (sayi>50&&sayi<=75){
            System.out.println("sayi 50-75 araliğindadir");
        }
        if (sayi>75&&sayi<=101){
            System.out.println("sayi 75-100 araliğindadir");
        }
    }

}
