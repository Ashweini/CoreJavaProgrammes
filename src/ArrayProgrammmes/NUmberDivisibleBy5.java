package ArrayProgrammmes;

import java.util.Scanner;

public class NUmberDivisibleBy5 {

	public static void main(String[] args) {
		
		/*int[] a=new int[10];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}*/
		
		int[] a= {5,2,5,66,7,97,46,34,54,55};
		for(int i=0;i<a.length;i++) {
			if(a[i]%5==0) {
			System.out.println(a[i]);
			}
		}

	}

}
