package day40_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		// verilen bir int Array icin kullanicidan sayi isteyin ve girilen
		// sayiyi index olar kabul edip  o inedx deki elementi yazdirin

			int arr[]= {2,3,4,5,6,2,7,9,1};
			//ArrayIndexOutOfBoundsException
			// InputMismatchException
			
			try {
			Scanner scan =new Scanner(System.in);
			System.out.println("lutfen elementi yazdirmak icin index giriniz");
			int index=scan.nextInt();
			
			System.out.println("girdiginiz indexsi"+ arr[index]);
				
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Girdiginiz index array de yok");
			}catch(InputMismatchException e) {
				System.out.println("girdiginiz index pozitfi tamsayi olmali");
			}
			
			
		
		
		
	}	

}
