package throwsProgram;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo2 {
	
	//JVM will handle this exception
	public static void main(String[] args) throws IOException, ArithmeticException{
		caller();
	}
	
	public static void caller() throws IOException, ArithmeticException{
		called();
	}
	
	public static void called() throws IOException, ArithmeticException {
		System.out.println("enter num1 value");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.println("Enter num2 value");
		int num2 = s.nextInt();
		System.out.println(num1/num2);
		
		FileReader file = new FileReader("xyz");
		
	}

}
