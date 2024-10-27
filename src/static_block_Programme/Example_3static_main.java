package static_block_Programme;

public class Example_3static_main {
	
	//single line initialzer 
	static int a = test();
	static int b = display();

//	public static void main(String[] args) {
//		System.out.println("take input from 2 method do addition a+b : "+(a+b));
//	}
	
	//multi line initializer 
	public static int test() {
		System.out.println("1st static providing 1st value : "+a+ " (default value)");
		return 1;
	}
	
	public static int display() {
		System.out.println("2nd static proving 2nd value :"+b+ " (default value)");
		return 2;
	}
	
	//output 
	  //1st static providing 1st value : 0 (default value)
	//2nd static proving 2nd value b (default value)
	//take input from 2 method do addition a+b : 3);
 
}
