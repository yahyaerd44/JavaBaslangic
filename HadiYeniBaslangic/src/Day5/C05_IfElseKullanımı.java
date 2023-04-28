package Day5;

public class C05_IfElseKullanımı {

    public static void main(String[] args) {
/*
        //int sayi=20;
            int sayi=100;
        if (sayi>=50){
            System.out.println("sayi 50 büyük veya eşit");
        }else {
            System.out.println("sayi 50 den büyük değil");
        }

 */
        String cinsiyet="Erkekj";
        int yas=25;

        if (cinsiyet.equals("Erkek")){
            if (yas>=20){
                System.out.println("askere gidebilirsiniz");
            }else {
                System.out.println("yasınız tutmuyor");
            }
        }else {
            System.out.println("kadın olduğunuz için askere gidemesiniz");
        }
    }

//52 de kaldım
}
