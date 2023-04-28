package Day2;

public class C11_Pratik {

    public static void main(String[] args) {
        /*
        3 basamklı bir tamsayinin basamaklarını consola yazdıran bir program yazınız
         */

        int sayi=678;

        int birler=sayi%10; //5

        sayi/=10;

        int onlar=sayi%10;//4

        sayi/=10;

        int yuzler=sayi%10;//3

        System.out.println("birler basmagı ="+ birler);
        System.out.println("onlar basmagı  ="+ onlar);
        System.out.println("yuzler basmagı ="+ yuzler);

        System.out.println("Sayıların Toplami"+birler+onlar+yuzler);




    }
}
