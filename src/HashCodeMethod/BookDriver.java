package HashCodeMethod;

public class BookDriver {

	public static void main(String[] args) {


		Book1 b1 = new Book1("swara", 111);
		Book1 b2 = new Book1("swara", 111);
		System.out.println(b1.getClass()); //class HashCodeMethod.Book1
		
		//System.out.println(b1.equals(b2));
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.hashCode()==b2.hashCode());

	}

}
