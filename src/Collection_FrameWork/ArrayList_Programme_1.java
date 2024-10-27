package Collection_FrameWork;

import java.util.ArrayList;

public class ArrayList_Programme_1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//Everything is Object
		al.add(10);
		al.add(20);
		al.add(15.50);
		al.add('e');
		al.add("Ashwini");
		System.out.println(al);  //[10, 20, 15.5, e, Ashwini]

		ArrayList al1 = new ArrayList();
		al1.add(50);
		al1.add(60);
		al.add(al1);  //Collection inside another collection
		System.out.println(al.add(al1));//true
		System.out.println(al); //[10, 20, 15.5, e, Ashwini, [50, 60]]
		

	}

}
