package Day2;

public class C12_Pratik {
    public static void main(String[] args) {

        int sayi=57;

        boolean sonuc1= sayi>0 && sayi<50;
        boolean sonuc2= sayi>=50 && sayi<100;

        boolean sonuc3= sayi>0 && sayi<50 && sayi%2==0;
        boolean sonuc4= sayi>=50 && sayi<100 && sayi%2==0;

        boolean sonuc5= sayi>0 && sayi<50 && sayi%2==1;
        boolean sonuc6= sayi>=5 && sayi<100 && sayi%2==1;

        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
        System.out.println(sonuc5);
        System.out.println(sonuc6);


    }
}
