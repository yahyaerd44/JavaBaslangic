package Day6;

import java.util.Scanner;

public class C03_Pratik {
    public static void main(String[] args) {
        /*
        kullanıcının girmiş olduğu tamsayının pozitif mi negatifmi
        veya nötr olduğunu yazan console yazan program yazın
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi>0){
            System.out.println("sayi pozitif");
        } else if (sayi<0) {
            System.out.println("sayi negatif");
        }else {
            System.out.println("sayi nötr");
        }

    }
}
