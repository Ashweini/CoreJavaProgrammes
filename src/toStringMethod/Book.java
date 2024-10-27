package toStringMethod;

public class Book {
	
	String title;
	String Author;
	double Price;
	
	Book(String title, String Author, double Price){
		this.title=title;
		this.Author=Author;
		this.Price=Price;
	}
	
	public String toString() {
		return "[Title : "+title +", Author : "+Author+", Price : "+Price+"]";
		
	}
	

}
