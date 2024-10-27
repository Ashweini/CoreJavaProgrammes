package throwsProgram;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args)  {
		System.out.println("Main start");
		try {
		caller();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main End");
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
