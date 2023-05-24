package day40_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		//kullacidan istedigi kadar sayi alip bu sayiari toplayiniz
		// sayi girisini bitirmek icin q basiniz
		
		int sayi=0;
		int toplam=0;
		//String secim="";
		int count=0;
		Scanner scan =new Scanner(System.in);
		
		try {
			while(count<10000) {
				
				System.out.println("lutfen toplamk icin bir sayi yaziniz \nBitirmek icin sayi disinda bir tusa basiniz ");
				sayi= scan.nextInt();
				toplam+=sayi;
				count++;
			}
		}catch(InputMismatchException e) {
			
			System.out.println("giridiginiz "+ count +" adet sayilarin toplami " + toplam);

		}
		
		//InputMismatchException
		//while(!secim.equalsIgnoreCase("q")){
		
		
		
		
		
	}

}
