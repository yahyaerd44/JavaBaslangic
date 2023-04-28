package Day9;

public class C05_Pratik {

    public static void main(String[] args) {
        /*
         1 den 50 kadar  5 ile bölüne bilen tüm sayıları console yazdırın
         */
        int sayi=1;

        while (sayi<=50){

            if(sayi%5==0){

                System.out.println(sayi);
            }
            sayi++;
        }
        System.out.println("alt satır çalıştır");
    }
}
