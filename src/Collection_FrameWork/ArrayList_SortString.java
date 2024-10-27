package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_SortString {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		names.add("pathlu");
		names.add("motu");
		names.add("Ashwini");
		names.add("Kaage");
		
		System.out.println(names);
		
		//sorting based on the alphabetical order
		Collections.sort(names);
		System.out.println(names);
	}

}
