package ExceptionHandling;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		try {
		System.out.println(num1/num2);
		String s = null;
		System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("caught");
		}
		
		catch(NullPointerException e ) {
		System.out.println("NPE caught");
		}
		System.out.println("Main end");

	}

}
