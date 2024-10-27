package Collection_FrameWork;

import java.util.ArrayList;

public class Traverse_Array {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1.get(0)); //10
		System.out.println(a1.get(a1.size()-1)); //40
		
		int sum =0;
		for(int i=0; i<a1.size();i++) {
			
			//traversing
			System.out.print(a1.get(i)+" ");
			sum = sum+a1.get(i);
		}
		
		System.out.println("\nSum is "+sum);
	}

}
