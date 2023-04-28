package Day4;

import java.util.Scanner;

public class C02_Pratik {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("byte:");
        byte deger1=scan.nextByte();

        System.out.println("Short:");
        short deger2=scan.nextShort();

        System.out.println("int:");
        int deger3=scan.nextInt();

        System.out.println("long:");
        long deger4=scan.nextLong();

        System.out.println("float:");
        float deger5=scan.nextFloat();

        System.out.println("double:");
        double deger6=scan.nextDouble();

        System.out.println("boolean:");
       boolean deger7=scan.hasNext();

        System.out.println("char :");
        char deger8=scan.next().charAt(0);


        System.out.println("byte deger : " + deger1);
        System.out.println("short deger : " + deger2);
        System.out.println("int deger : " + deger3);
        System.out.println("long deger : " + deger4);
        System.out.println("float deger : " + deger5);
        System.out.println("double deger : " + deger6);
        System.out.println("boolean deger : " + deger7);
        System.out.println("char deger : " + deger8);




    }
}
