package LinkedListProgrammes;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		//l - list collection data
		System.out.println(l);  //[10, 20, 30, 40]
		
		LinkedList l2 = new LinkedList();
		l2.add(50);
		l2.add(60);
		l2.add(70);
		l2.add(80);
		
		//l - list collection data
		System.out.println(l2);//[50, 60, 70, 80]
		
//		l.add(l2); //gives result inside []
//		System.out.println(l);//[10, 20, 30, 40, [50, 60, 70, 80]]
		
		//addAll - insert collection inside another collection
		l.addAll(l2);
		System.out.println(l); //[10, 20, 30, 40, 50, 60, 70, 80]
	
		//accessing and traversing from collection present in l Linkedlist
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	
		//check that particular element is present or not 
		System.out.println("\n"+l.contains(20)); //true
		
		//check index of that particular element 
		System.out.println(l.indexOf(20)); //1
		
		//remove the elemt from l list index 0
		System.out.println(l.remove(0)); //10
		//print after removing 
		System.out.println(l);  //[20, 30, 40, 50, 60, 70, 80]
	}
}
