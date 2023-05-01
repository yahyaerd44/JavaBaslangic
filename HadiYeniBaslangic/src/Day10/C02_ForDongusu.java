package Day10;

public class C02_ForDongusu {
    public static void main(String[] args) {

        /*

        for (int i = 0; i < Koşul ; i++) {
        ---------       ----------  ------
           1                2         3
           for döngüsünde 1. bir kere çalışır
           2.true ise parantez içi çalışır sonra 3. kısımda artırma yada azaltma olur
           gene 2.kısım koşul true ise gene aynı sıralama devam eder sonuc flase olana kadar
                    }
         */

        for (int i = 0; i <=10; i++) {

            System.out.println("merhaba:"+i);
        }
        for (int i = 10; i >0 ; i--) {
            System.out.println("merhaba"+i);

        }
    }
}
