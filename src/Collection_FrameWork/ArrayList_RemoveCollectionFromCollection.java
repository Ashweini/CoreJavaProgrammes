package Collection_FrameWork;

import java.util.ArrayList;

public class ArrayList_RemoveCollectionFromCollection {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		System.out.println(a1);
		
		ArrayList al = new ArrayList();
		al.add(50);
		al.add(20);
		al.add(30);
		al.add(80);
		System.out.println(al);
		
//		System.out.println("removed common data removed ");
//		a1.removeAll(al);
//		System.out.println(a1); //removes common data gives unique - [10, 40]
		
		System.out.println("retailall opposite to remove all - removing unique element");
		a1.retainAll(al);
		System.out.println(a1);//removes unique element - [20, 30]
	}

}
