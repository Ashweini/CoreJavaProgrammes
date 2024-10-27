package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_numofCharacter {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("India");
		al.add("America");
		al.add("London");
		al.add("Paris");
		
		for (String str : al) {
			System.out.println(str + "No of character "+ str.length());
		}

	}

}
