package Collection_FrameWork;

import java.util.ArrayList;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al); //[10, 20, 30, 40]
		
		//remove based on index
		al.remove(0);
		System.out.println(al);//[20, 30, 40]
		
		al.remove(al.size()-1);
		System.out.println(al);//[20, 30]
	}

}
