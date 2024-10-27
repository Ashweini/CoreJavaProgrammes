package Collection_FrameWork;

import java.util.ArrayList;
public class ArrayList_Programme {
//add elements 
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//Everything is Object
		al.add(10);
		al.add(20);
		al.add(15.50);
		al.add('e');
		al.add("Ashwini");
		System.out.println(al);  //[10, 20, 15.5, e, Ashwini]
		
//here we are not getting address value bcs in evry inbuild class toString will be overriden bcz of this we will get actual data instead of address
//here we ArrayList impleted toString method
		

	}

}
