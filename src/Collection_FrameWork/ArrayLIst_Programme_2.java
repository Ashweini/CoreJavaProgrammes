package Collection_FrameWork;

import java.util.ArrayList;

public class ArrayLIst_Programme_2 {

	public static void main(String[] args) {
		ArrayList Menu = new ArrayList();
	
		//Generic collection : In which we can add only same type of Data
		ArrayList<String> northMenu = new ArrayList<>();
		northMenu.add("VadaPav");
		northMenu.add("Chole bature");
		northMenu.add("paratha");
		
		ArrayList<String> southMenu = new ArrayList<>();
		southMenu.add("idli");
		southMenu.add("Masala Dosa");
		southMenu.add("Rice");
	    
		Menu.addAll(northMenu);
		Menu.addAll(southMenu);
		System.out.println(Menu);  //[VadaPav, Chole bature, paratha, idli, Masala Dosa, Rice]
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		//num.add(10.10);
	}

}
