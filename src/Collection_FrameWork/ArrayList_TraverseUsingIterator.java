package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_TraverseUsingIterator {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		//Iterator Object
		Iterator i =a1.iterator();
		
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());//NoSuchElementException
		
		System.out.println("Using hasNext");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
