package ArrayProgrammmes;

import java.util.Scanner;

public class PrintUserDataReverse {

	public static void main(String[] args) {
		int[] a=new int[4];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array element");
		
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		


	}

}
