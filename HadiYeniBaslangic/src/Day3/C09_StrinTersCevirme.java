package Day3;

public class C09_StrinTersCevirme {


    public static void main(String[] args) {
        String metin = "Ben Javayi Seviyorum";
        String cevrilenMetin = cevir(metin);
        System.out.println("Ters Cevrilen:==>"+cevrilenMetin);
        System.out.println(metin);
    }


    public static String cevir(String metin) {
        {
            if (metin.isEmpty())
                return metin;
            return cevir(metin.substring(1)) + metin.charAt(0);
        }


    }
    }
