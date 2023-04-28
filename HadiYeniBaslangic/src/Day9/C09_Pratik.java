package Day9;

public class C09_Pratik {
    public static void main(String[] args) {
        /*
        Sonsuza kadar çalışan bir tane while loop oluşturun. ve
        100. çalışması sırasında döngüyü "break" ifadesi ile sonaerdirsin..

        =================================================================
        int sayi =0;

        while (sayi<10){ // 10 kere yazar ondan sonra durur
            System.out.println(sayi);
           sayi++;
        ============================================================

        int sayi =0;

        while (sayi<1000){
            System.out.println(sayi);

            if (sayi>100){// eğer sayi 10 dan büyük olduğu anda döngü durur
                break;
            }
            sayi++;
        }
        System.out.println("alt satır çalıştır");

         ================================================================
        int sayi =0;

        while (true){// sonsuz döngü
            System.out.println(sayi);

            if (sayi>99){// eğer sayi 100 dan büyük olduğu anda döngü durur
                break;
            }
            sayi++;
        }
        System.out.println("alt satır çalıştır");

         */
      int sayi=0;
        while (true){
            sayi++;

            if (sayi>99){// eğer sayi 10 dan büyük olduğu anda döngü durur
                break;
            }

            if (sayi==20){
                continue;

            }
            System.out.println(sayi);
        }


    }

}
