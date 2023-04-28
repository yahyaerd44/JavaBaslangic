package Day8;

public class C05_Pratik {
    public static void main(String[] args) {
        /* string ten array oluşturma
        Split methodu

        lenght = array uzunluğu veriyor
         */

        String diller = " Turkçe, İngilizce, Arapça, Fransızca, Almanca";

        String[] array= diller.split(",");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        System.out.println(array.length);
    }
}
