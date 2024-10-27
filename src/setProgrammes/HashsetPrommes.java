package setProgrammes;

import java.util.HashSet;

import Interface.E;

public class HashsetPrommes {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(null);
		set.add(10);
		set.add(null);
		//
		System.out.println(set);
		
		//search element in set
		if(set.contains(50))
			System.out.println("50 is present");
		else
			System.out.println("not present inside set");
		
		//remove
		if(set.remove(40))
			System.out.println("removed successfully");
		else
			System.out.println("Not present in set");
		
		
		
	}
}
