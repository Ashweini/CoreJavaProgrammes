package toStringMethod;

public class BookDriver {

	public static void main(String[] args) {

		Book b1 = new Book("Java", "Vaibhav",1000.00);
		Book b2 = new Book("JavaScript", "Triveni",500);
		Book b3 = new Book("Python", "Vaibhav",800);
		
		//System.out.println(b1.toString());
//		b1.title="Java";
//		b1.Author="Vaibhav";
//		b1.Price=1000.00;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}
