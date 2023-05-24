package Day29_StaticBlock_PassByValue;

public class C02_PassBay {

	public static void main(String[] args) {
		// 100 tl satilan 
		int fiyat=100;
		
		indirimfiyat25(fiyat);
		System.out.println("methodtan sonra main method fiyat " +fiyat);
		indirimyap10(fiyat);
		System.out.println("methodtan sonra main method fiyat " +fiyat);
	}

	private static void indirimfiyat25(int fiyat) {
		fiyat*=0.75;
		System.out.println("%25 fiyat indirim"+ fiyat);
	}

	private static void indirimyap10(int fiyat) {
		// TODO Auto-generated method stub
		
		fiyat*=0.90;
		System.out.println("%10 indirimli fiyat" + fiyat);
	}

}
