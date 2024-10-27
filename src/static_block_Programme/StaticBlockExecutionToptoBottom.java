package static_block_Programme;

public class StaticBlockExecutionToptoBottom {
	//if the class has multiple static blocks they will execute top to bottom
	static {
		System.out.println("I am from static block-1");
	}
	
	public static void main(String[] args) {
		System.out.println("I am from main method");
	}
	static {
		System.out.println("I am from static block-2");
	}
	static {
		System.out.println("I am from static block-3");
	}

}
