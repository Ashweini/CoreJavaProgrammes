package ObjectProgrammes;

public class BookMAinApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a Object
		Book b1=new Book();
		//Initialization
		b1.title = "WebTech";
		b1.price = 2000;
		
		Book b2=new Book();
		b2.title = "JAVA";
		b2.price = 1500;
		
		Book b3=new Book();
		b3.title = "SQL";
		b3.price = 500;

		//print data
		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println(b2.title);
		System.out.println(b2.price);
		System.out.println(b3.title);
		System.out.println(b3.price);
	}
	

}
