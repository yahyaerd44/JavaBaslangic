package day28_ConstructorCall_sataticKeybord;

public class C02 {
    int x=5;
    static int y=10;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		C02 obje1 = new C02();
		System.out.println("obje1 icin x :" + obje1.x+" " + "obje1 icin x :"+y );
		
		obje1.x++;
		y++;
		System.out.println("islemden sonra obje1 icin x :" + obje1.x+" " + "obje1 icin x :"+y );
	
		C02 obje2 = new C02();
		System.out.println("obje1 icin x :" + obje2.x+" " + "obje1 icin x :"+y );
		
		obje2.x++;
		y++;
		System.out.println("islemden sonra obje1 icin x :" + obje2.x+" " + "obje1 icin x :"+y );
	
		C02 obje3 = new C02();
		obje3.x=20;
		y=40;
		System.out.println(" obje3'den sonra icin x :" + obje1.x );
		System.out.println(" obje3'den sonra icin x :" + obje2.x );
		System.out.println(" obje3'den sonra icin x :" + obje3.x );
		
		System.out.println(" obje3'den sonra icin y :" + y );
		System.out.println(" obje3'den sonra icin y :" + y );
		System.out.println(" obje3'den sonra icin y :" + y );
		
	}
	

}
