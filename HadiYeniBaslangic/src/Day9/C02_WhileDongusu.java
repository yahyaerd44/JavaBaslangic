package Day9;

public class C02_WhileDongusu {

    public static void main(String[] args) {
        /*
        istediğimiz kadar döngü oluşturuz
        While(koşul){
        kodlar
        {
         */

        int sayi=1;

     while (sayi<10){ // eğer sayi her seferinde artırmazsak döngü sonsuz olur çünkü sayi 1 oldğu için
                      // sayi hep 10 dan küçük olur.

         System.out.println("merhaba");

         sayi++; // eğer sayi her seferinde artırmazsak döngü sonsuz olur çünkü sayi 1 oldğu için
                 //sonuc olarak 9 kere Merhaba yazar sonra alt satır çalıştırır

     }
        System.out.println("alt satır");
    }
}
