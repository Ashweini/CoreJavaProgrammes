package Collection_FrameWork;

import java.util.ArrayList;

public class searchElements {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		//search an element in arrayList  al
		//ele -> 30
		int ele = 30;
		System.out.println(al.contains(ele));//true
		System.out.println(al.contains(50));//false
		
		System.out.println(al.indexOf(ele));//2

	}

}
