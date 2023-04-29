package Day9;

public class C10_Pratik {
    public static void main(String[] args) {
        int sayi = 0;
        while (true) {
            sayi++;

            if (sayi > 99) {// eğer sayi 10 dan büyük olduğu anda döngü durur
                break;
            }

            if (sayi == 20) {
                continue;

            }
            System.out.println(sayi);

        }
    }
}
