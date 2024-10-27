package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sorting {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(5);
		a1.add(7);
		a1.add(20);
		
		System.out.println("before sorting : \n"+a1);
		
		Collections.sort(a1);
		
		System.out.println("after sorting : \n"+a1);

	}

}
