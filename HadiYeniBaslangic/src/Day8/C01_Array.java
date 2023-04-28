package Day8;

public class C01_Array {

    public static void main(String[] args) {

        /*
        aynı dipte birden fazla veri tutmak için kullanılır

        Array genel kullanımı
        int[] sayi=new int[5]; // verileri daha sonra eklemek isterseniz
        int[] sayilar={1,2,3,46,7}; // 5 uzunluğunda

        String[] adSoyad=new String[7];



         */
        // String[] adSoyad=new String[7];

     //   int[] sayilar=new int[5]; // verileri daha sonra eklemek isterseniz
        /*
        int[] sayilar={20,30,40,50,60};

        sayilar[0]=100; // birinci indexi değiştir 100 ile dediğimizde 20 yi kaldırı yerine 100 yazar

        System.out.println(sayilar[0]);
        System.out.println(sayilar[1]);
        System.out.println(sayilar[2]);
        System.out.println(sayilar[3]);
        System.out.println(sayilar[4]);

         */
        int[] sayilar=new int[5];

        sayilar[0]=100;
        sayilar[1]=200;
        sayilar[2]=300;
        sayilar[4]=500;


        System.out.println(sayilar[0]);
        System.out.println(sayilar[1]);
        System.out.println(sayilar[2]);
        System.out.println(sayilar[3]);
        System.out.println(sayilar[4]);


    }
}
