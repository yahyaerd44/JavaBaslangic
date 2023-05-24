package day28_ConstructorCall_sataticKeybord;

public class C03 {

	public static void main(String[] args) {
		C02 obje1 = new C02();
		System.out.println("obje1 icin x :" + obje1.x+" " + "obje1 icin x :"+obje1.y );
		
		obje1.x++;
		obje1.y++;
		System.out.println("islemden sonra obje1 icin x :" + obje1.x+" " + "obje1 icin x :"+obje1.y );
	
		C02 obje2 = new C02();
		System.out.println("obje1 icin x :" + obje2.x+" " + "obje1 icin x :"+obje2.y );
		
		obje2.x++;
		obje2.y++;
		System.out.println("islemden sonra obje1 icin x :" + obje2.x+" " + "obje1 icin x :"+obje2.y );
	
		C02 obje3 = new C02();
		obje3.x=20;
		obje3.y=40;
		System.out.println(" obje3'den sonra icin x :" + obje1.x );
		System.out.println(" obje3'den sonra icin x :" + obje2.x );
		System.out.println(" obje3'den sonra icin x :" + obje3.x );
		
		System.out.println(" obje3'den sonra icin y :" + obje1.y );
		System.out.println(" obje3'den sonra icin y :" + obje2.y );
		System.out.println(" obje3'den sonra icin y :" + obje3.y );
			// TODO Auto-generated method stub

	}

}
