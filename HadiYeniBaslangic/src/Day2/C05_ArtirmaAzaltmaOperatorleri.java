package Day2;

public class C05_ArtirmaAzaltmaOperatorleri {
    public static void main(String[] args) {
        // artirma oparatorler,
        int sayi1=30;
        int sayi2=40;
        System.out.println(sayi1);
        System.out.println(sayi2);
//=================================================================
        /*
        // once artırıyor sonra yazıyor
        System.out.println(++sayi1);
        //once azalt sonra yazıyor
        System.out.println(--sayi2);

         */
//======================================================================
/*
        // degiskene deger artar ondan sonra yazarzak artmıs olur
        sayi1++;
        // degiskene deger azaltır ondan sonra yazarzak azaltmış  olur
        sayi2--;
        System.out.println(sayi1);
        System.out.println(sayi2);


 */
        // degiskeni aynı yazar ama ikinci yazdgimizda degeri artıtırır
        System.out.println(sayi1++);
        // degiskeni aynı yazar ama ikinci yazdgimizda degeri azaltır.
        System.out.println(sayi2--);

        System.out.println(sayi1);
        System.out.println(sayi2);







    }
}
