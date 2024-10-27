package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIterator_Ex1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
//		for(int i=1; i<=5; i++) {
//			
//			al.add(10+i);
//		}
//		System.out.println(al);
		
		//create instance of List Iterator
		ListIterator i =al.listIterator();
		System.out.println(i.next());
		
		ListIterator i1 =al.listIterator(2);
		System.out.println(i1.next());
		
		
	}
}
