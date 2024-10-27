package EqualsMethod;

public class BookDriver {

	public static void main(String[] args) {

		Book b1 = new Book(100);
		Book b2 = b1;
		
		System.out.println(b1==b2);  //true
		System.out.println(b1.equals(b2));//true
		
		Book b3 = new Book(200);
		Book b4 = new Book(200);
		System.out.println(b3==b4);  //false
		System.out.println(b3.equals(b4)); //false
		
	}

}
