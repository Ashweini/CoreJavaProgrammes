package MethodOverriding;
import java.util.Scanner;

public class OlaDriver {
	public static void main(String[] args) {

		Ola ola=new  Ola();
		System.out.println("Select option");
		System.out.println("1 for mini\n2 for Sedon\n3 for Lux");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the coice");
		int choice = sc.nextInt();
		
		Cab b;
		
		switch(choice){
			case 1:{
				ola.bookCab(new Mini());
				break;
		}
		case 2:{
			ola.bookCab(new Sedon());
			break;
		}
		case 3 :{
			ola.bookCab(new Lux());
			break;
		}
		default :{
			System.out.println("Invalid Entry");
		}
		}

	}

}
