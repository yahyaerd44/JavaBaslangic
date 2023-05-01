package Day10;

public class C03_Pratik {
    public static void main(String[] args) {

        String[] isimler={"Ali","Mustafa","Ahmet","Hakan","Veli"};

        for (int i = 0; i <isimler.length ; i++) {
            System.out.println(isimler[i]);


        }
        for (int i = isimler.length-1; i >=0; i--) {
            System.out.println(isimler[i]); // array string ters yazdırır

        }
    }
}
