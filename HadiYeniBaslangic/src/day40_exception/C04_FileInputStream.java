package day40_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// javada  bir dosyaya ulasmak istedigimizde _FileInputStream classindan yardim alariz
		
		FileInputStream fis =new FileInputStream("src\\day40_exception\\yaz.txt"); 
		
		// java bu kodda olasi bir probleme ongoruyor ve bu porbleme karsi ne yapöali gerektigini bize soruyor
		// 
		System.out.println("gorev tamamlandi");
	}

}
