package ExceptionHandling;

import java.util.Scanner;

public class tryCatchProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.println("Main start");
		//System.out.println(10/0); //java.lang.ArithmeticException: / by zero
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		try {
		System.out.println(num1/num2);
		}catch(Exception e) {
			System.out.println("caught");
		}
		System.out.println("Main end");

	}

}
