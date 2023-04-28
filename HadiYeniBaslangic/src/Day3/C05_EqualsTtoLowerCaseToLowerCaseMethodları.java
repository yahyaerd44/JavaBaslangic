package Day3;

public class C05_EqualsTtoLowerCaseToLowerCaseMethodları {

    public static void main(String[] args) {
        /* equals() = eşit mi
         toLowerCase() = küçük harfler
         toUpperCase() = büyük harfler    methodları

         equalsIgnoreCase = eşitleme yaparken küçük ve büyük harf duyarliliğini ömensme


         */

        String isim = "hamza";
        String isim2 = "Kerem";
        String isim3="hamza";
        String isim4 = "kerem";


     boolean esitMi=  isim.equals(isim2);
        System.out.println(esitMi);
        boolean esitMi1=isim.equals(isim3);
        System.out.println(esitMi1);

        boolean esitMi2 = isim2.equalsIgnoreCase(isim4);
        System.out.println(esitMi2);

        String dil="Java Programlama Dili";

        System.out.println(dil.toLowerCase());
        System.out.println(dil.toUpperCase());


    }
}
