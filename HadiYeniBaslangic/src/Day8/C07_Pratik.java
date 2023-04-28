package Day8;

public class C07_Pratik {
    public static void main(String[] args) {
        /*
         String[] ifadeler=kelimeler.split(".");
         java özel karekter . * ? array cevirirken özl karekter den önce \\.

           String[] ifadeler=kelimeler.split("\\.");

         */

        String kelimeler="Bugün Cuma. iyi günler. Kendine İyi bak.";

        String[] ifadeler=kelimeler.split("\\.");

        System.out.println(ifadeler.length);
        System.out.println(ifadeler[0]);
        System.out.println(ifadeler[1]);
        System.out.println(ifadeler[2]);


    }
}
