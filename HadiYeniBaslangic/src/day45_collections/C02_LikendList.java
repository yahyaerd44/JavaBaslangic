package day45_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LikendList {

	public static void main(String[] args) {

		List<Integer> ll=new LinkedList<>();
		ll.add(5);
		ll.add(7);
		System.out.println("list"+ ll);//[5, 7]
		
		ll.add(9); // data turunu List sectigimiz icin sadce List Interface teki 
		System.out.println("9 ekleyince" +ll);
		
		
		Queue<Integer> ll2=new LinkedList<>();
		ll2.add(5);
		ll2.add(7);
		ll2.clear();// data turu  Queue secilince Queue interface 
		System.out.println("ll2 silince"+ ll2);
		
		Deque<Integer> ll3=new LinkedList<>();
		ll3.add(5);
		ll3.add(7);
		ll3.addLast(20);
		System.out.println("ll3 silince"+ ll3);
		
	}

}
