package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class BookDriver {

	public static void main(String[] args) {
		ArrayList books = new ArrayList();
		books.add(new Book(100));
		books.add(new Book(50));
		books.add(new Book(70));
		books.add(new Book(20));
		
		System.out.println("before sorting \n"+books);
		//sort internally has operation to compare and sort
		Collections.sort(books);
		System.out.println("after sorting \n"+books);
	}



}
