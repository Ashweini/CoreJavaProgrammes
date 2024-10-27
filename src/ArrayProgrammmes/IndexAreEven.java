package ArrayProgrammmes;

import java.util.Scanner;

public class IndexAreEven {

	public static void main(String[] args) {

		int[] a=new int[5];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//both even index and even data
		for(int i=0;i<a.length;i++) {
			if(i%2==0 && a[i]%2==0) {
			System.out.println(a[i]);
			}
		
			//even index values
		/*for(int i=0;i<a.length;i++) {
			if(i%2==0) {
			System.out.println(a[i]);
			}*/
		
		
		}

	}

}
