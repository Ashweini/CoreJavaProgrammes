package Interface;

public interface Demo {
	
	public static final int a = 10;
	
	void test();  //by default public abstract
	
	
	//interface cannot have concrete non-static method
//	void display() {
//		
//	}
	
	//from jdk-8 public static method allowed
	 static void m1() {
		
	}
	 
	 public static void main(String[] args) {
		System.out.println("From interface main method");
	}

}
