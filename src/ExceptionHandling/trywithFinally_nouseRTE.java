package ExceptionHandling;

public class trywithFinally_nouseRTE {

	public static void main(String[] args) {


		try {
			String s = "1bc123";
			int n = Integer.parseInt(s);
		}
		finally {
			System.out.println("Finally block");
		}
//		Finally block
//		Exception in thread "main" java.lang.NumberFormatException: For input string: "1bc123"
	}

}
