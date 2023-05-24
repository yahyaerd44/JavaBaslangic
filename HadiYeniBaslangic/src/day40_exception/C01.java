package day40_exception;

public class C01 {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		
		
		try {
		System.out.println("sayialrin bolymu :"+a/b );
		}catch (ArithmeticException e) {
			
		System.out.println("sifira bolum yapilamaz");
		e.printStackTrace(); // yaptigi hatta java.lang.ArithmeticException: / by zero at day40_exception.C01.main(C01.java:11)
		e.getStackTrace();
		
		
		}
		System.out.println("görev tammalandi");
	}

}
