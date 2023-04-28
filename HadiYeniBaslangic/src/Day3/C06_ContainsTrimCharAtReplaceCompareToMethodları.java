package Day3;

public class C06_ContainsTrimCharAtReplaceCompareToMethodları {
    public static void main(String[] args) {
        /*
        contains(): içeriyormu
        trim():boşluk karekterini temizler
        charAt(): index teki kareketeri alır
        replace(): String içindeki değişiklikleri yapar
        compareTo(): iki string karşılaştırır
        methodları
         */

        String diller= "ingilizce, fransızca, ispanyolca, türkçe";

        System.out.println(diller.contains("arapça"));
        System.out.println(diller.trim());
        System.out.println(diller.charAt(25));
        System.out.println(diller.replace("ispanyolca", "hadi"));

        String isim1 ="Hadi";
        String isim2 ="Beşire";

        System.out.println(isim1.compareTo(isim2));


    }
}
