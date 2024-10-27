package Collection_FrameWork;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Ex2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		//to traverse in forward direction using  Listiterator
		ListIterator forward = al.listIterator();
		//use next method and hasNext method
		System.out.println("Forward direction : ");
		while(forward.hasNext()) {
			System.out.println(forward.next());
		}
		
		ListIterator backward = al.listIterator(al.size());  //starting from last I am getting reverse order
		//to traverse al in reverse order using listIterator 
		System.out.println("Backward direction : ");
		while(backward.hasPrevious()) {
			System.out.println(backward.previous());
		}
	}
}
