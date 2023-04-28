package Day3;

public class C07_Substring {
    public static void main(String[] args) {
        // substring() ile String'in istenilen bölümünü alma belirlediğimiz dğerler arasını alma

        String diller= "ingilizce, fransızca, ispanyolca, türkçe";

        System.out.println(diller.substring(0, 9));
        System.out.println(diller.substring(11, 20));
        System.out.println(diller.substring(22, 32));
        System.out.println(diller.substring(34, 40));

    }
}
