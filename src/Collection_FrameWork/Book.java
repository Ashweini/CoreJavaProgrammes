package Collection_FrameWork;

public class Book implements Comparable<Book>{
//implements Comparable<Book>
	int price;
	Book(){
		
	}
	
	Book(int price){
		this.price=price;
	}

	//comparable interface ability to compareTo
	@Override
	public int compareTo(Book o) {
		
		return this.price-o.price;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	
	
	
}
