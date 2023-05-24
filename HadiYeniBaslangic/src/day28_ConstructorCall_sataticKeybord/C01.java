package day28_ConstructorCall_sataticKeybord;

public class C01 {
	int x = 3; 
	int y = 5;
	
	C01() {
	x += 1;
	System.out.print("-x" + x); 

	}
		
	C01(int i) {

	this(); 
	this.y = i; x += y;

	System.out.print("-x" + x); 
	}		
	C01(int i, int i2) {

	this(3); 
	this.x -= 4;

	System.out.print("-x" + x); 
	}
 @SuppressWarnings("unused")
 public static void main(String[] args) {

	 C01 mc1 = new C01(4,3);
	 // constructor clismaya vbaslidiktan sonra x ve y ile igili degigismeler 
 }

	}
	                   