package throwProgram;

import java.util.Scanner;

public class AgeRestrictionClass {

	public static void main(String[] args) {


		System.out.println("Enter age");
		Scanner s=new Scanner(System.in);
		int age = s.nextInt();
		
		if(age<18) {
			throw new UnderAgeException("Age should be greater than 18");
		}else if(age>60){
			throw new OverageException("Age should be less than 60");
		}else {
			System.out.println("eligible");
		}

	}

}
