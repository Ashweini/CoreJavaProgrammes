package HashCodeMethod;

public class Book1 {
	
	String name;
	double price;
	
	Book1(String name, double price){
		this.name=name;
		this.price=price;
	}
	
	public boolean equals(Object O) {
		Book1 b = (Book1)O;
		if(this.name.equals(b.name) && this.price==b.price){
			return true;
		}
		return false;
	}
	
	//hash code
	public int hashCode() {
		return this.name.hashCode()+(int)price; //primitive typeCasting
	}

}
