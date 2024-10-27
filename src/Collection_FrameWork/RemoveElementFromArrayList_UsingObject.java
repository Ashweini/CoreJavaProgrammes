package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementFromArrayList_UsingObject {

	public static void main(String[] args) {
		ArrayList<String> countries = new ArrayList();
		countries.add("India");
		countries.add("USA");
		countries.add("Australia");
		countries.add("London");

		System.out.println("=======Before remove===========");
		for (String country : countries) {
			System.out.println(country);
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the country you want to remove");
		String key = s.nextLine();
		
		if(countries.remove(key)) {
			System.out.println("Successfully removes...!!");
		}else {
			System.out.println("Entered data not in list");
		}
		
		System.out.println("-------After removing data-------");
		for (String country : countries) {
			System.out.println(country);
		}
	}

}
