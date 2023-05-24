package day45_collections;

import java.util.LinkedList;

public class C03_LikendList {

	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<>();

		System.out.println(ll);//[]
		ll.add(5);
		ll.add(7);
		ll.add(11);
		System.out.println("ekleme yapildikten sonra"+ ll);//[5, 7]
		System.out.println(ll.peek());//5 silmeden ilk elamani getirir
		System.out.println(ll.peekFirst());//5 silmeden ilk elamani getirir

		LinkedList<Integer> ll2=new LinkedList<>();

		System.out.println(ll2.peekFirst());//null
		System.out.println(ll2.peek());//null
		System.out.println(ll.element()); //5
			// System.out.println(ll2.element());// java.util.NoSuchElementException
		System.out.println(	ll.poll());//5	 sildi
		System.out.println(ll);// 7 
		System.out.println(	ll.poll());//7
		System.out.println(ll); //[]
		System.out.println("son pool==>"+	ll.poll());//null
		
		System.out.println(ll.hashCode());//1 javanin verdigi hascode 
		System.out.println(ll2.hashCode());
		ll2.add(11);
		System.out.println("11 ekleyince==> " +ll2.hashCode());//42
		ll2.offer(10);
		System.out.println("gh=="+ ll2);
		System.out.println(ll2.offer(null));
		
		ll2.push(2);
		System.out.println(ll2);
	
		
		
		
			
	}

}
