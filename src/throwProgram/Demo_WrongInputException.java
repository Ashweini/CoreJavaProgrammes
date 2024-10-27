package throwProgram;

import java.util.Scanner;

public class Demo_WrongInputException {

	public static void main(String[] args) {
		try {
			called();
			}catch(Exception e) {
				e.printStackTrace();
			}

	}
	
public static void called() {
		
		System.out.println("enter num1 value");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.println("Enter num2 value");
		int num2 = s.nextInt();
		if(num2==0) {
			//ArithmeticException is a class it has constructor accepts arguments 
			throw new WrongInputException("Denominator should not be 0 pls give correct value");
		}else {
			System.out.println(num1/num2);
		}
	}


}
