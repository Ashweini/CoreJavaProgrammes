package Collection_FrameWork;

import java.util.ArrayList;

public class StringsearchElement {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("abc");
		al.add("efg");
		al.add("hij");
		al.add("klm");
		
		String ele = "efg";
		System.out.println(al.contains(ele));//true
		System.out.println(al.contains("xyz"));//false
		
		System.out.println(al.indexOf("klm"));//3
		System.out.println(al.indexOf(ele));//1

	}

}
