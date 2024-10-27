package Collection_FrameWork;

import java.util.ArrayList;

public class Traverse_ArrayList_UsingFor_Each {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("Hello");
		
		//access ArrayList using for each loop
		for(Object obj : al) {
			System.out.print(obj+" ");
		}
		
		

	}

}
