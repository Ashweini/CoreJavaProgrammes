package UpCasting;

public class CanMainApp2Driver {

	//design a method which accept object and print it  
	public static void DisplayReference(Cab o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		DisplayReference(new Mini());
		DisplayReference(new Sedon());
		DisplayReference(new Luxury());
	}
	
	/*
	 * *
	 * *Conclusion : we can create a method which can accept different type of Object
	 */
}
