package day22_arrays;

public class C01_TekRar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] arr = {{"A","B","C"}, {"D","E"}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((arr[i][j]+ " "));
				if (arr[i][j].equals("B")) {
					continue;
				}
				
			}
			continue;
		}
	}

}
