package Day2;

public class C10_Pratik {
    public static void main(String[] args) {
        /*
        25=30
        25>30
        25<30
                 */

        int sayi1=45;
        int sayi2=30;

        boolean EsitMi=sayi1==sayi2;
        System.out.println(sayi1+"=="+sayi2 +"="+EsitMi);

        boolean BuyukMu=sayi1>sayi2;
        System.out.println(sayi1+">"+sayi2 +"="+BuyukMu);

        boolean KucukkMu=sayi1<sayi2;
        System.out.println(sayi1+"<"+sayi2 +"="+KucukkMu);
    }
}
