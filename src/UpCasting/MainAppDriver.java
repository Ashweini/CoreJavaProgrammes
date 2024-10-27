package UpCasting;

import java.util.Scanner;

public class MainAppDriver {

	public static void main(String[] args) {
		
		System.out.println("++++ Select a Cab ehich you want drive+++++");
		System.out.println("Press 1 for mini\nPress 2 for Sedon\nPress 3 for Luxury");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		
		Cab cab = null; //Cab is a generalized container
		
		switch(choice) {
		case 1 :
			cab = new Mini(); //Upcasting
			break;
		case 2 :
			cab = new Sedon();//Upcasting
			break;
		case 3 :
			cab = new Luxury();//Upcasting
			break;
		default :
			System.err.println("Invalid Input");
		
		}
		System.out.println(cab);
		
	}

}
