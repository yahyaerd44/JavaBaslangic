package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_deque {

	public static void main(String[] args) {

		Deque<String> ciftBasli = new LinkedList<>();
		
		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");
		
		System.out.println(ciftBasli);
		ciftBasli.add("Emine");
		System.out.println(ciftBasli);
		
		
		
		
		System.out.println(ciftBasli.pop());
		
		ciftBasli.push("Seyfullah");
		System.out.println(ciftBasli);
		
		
	}

}
