package Day9;

public class C08_Pratik {
    public static void main(String[] args) {
        /*
        bir array içerisindeki sayiların toplamını while döngüsyle toplayalım
        ------------------------------------------------
        int[] sayi={20,30,40,50,70};

        int toplam =sayi[0]+sayi[1]+sayi[2]+sayi[3]; // bu klasik yöntem
        System.out.println(toplam);
         */

        int[] sayi={20,30,40,50,70,60,69,4,56,25};
        int sira=0;
        int uzunluk=sayi.length;
        int toplam=0;

        while (sira<uzunluk){
            toplam+=sayi[sira];//sayi[0]+sayi[1]+sayi[2]+sayi[3]....

            sira++;

        }
        System.out.println("sayilarin Toplami:"+toplam);

    }
}
