package day45_collections;

import java.util.LinkedList;

public class C01_LikendList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();

		System.out.println(ll);//[]
		ll.add(5);
		ll.add(7);
		System.out.println(ll);//[5, 7]
		
		ll.add(0,10);
		System.out.println(ll);// [10, 5, 7] list interface ten glen ilk sýraya ekler
		
		ll.addFirst(3);
		System.out.println(ll);// [3, 10, 5, 7]  Quere gelne ozelikten ilk sýraya ekler
	
		LinkedList<Integer> ll2 =new LinkedList<>();
	
		ll2.addAll(ll);
		System.out.println(ll2);
	
	} 
	

}
