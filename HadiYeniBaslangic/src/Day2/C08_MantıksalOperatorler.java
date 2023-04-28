package Day2;

public class C08_MantıksalOperatorler {
    public static void main(String[] args) {
        int sayi1=101;

        // && ve opretoru butun sartlar true ise sonuc true, sartlardan biri false ise sonuc false dir..
        // || veya operatoru bir sart true sonuc true

        //   true      true           sonuc true
        //sayi1>50 && sayi1<100 ---->

        /* true && true =true
           true && false= false

           true || true =true
           true || false= true
           false || false = false


         */

        System.out.println(sayi1>50 && sayi1<100);
        System.out.println(sayi1>50 || sayi1<100);


    }
}
