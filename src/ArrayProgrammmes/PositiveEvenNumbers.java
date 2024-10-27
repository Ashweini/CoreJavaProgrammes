package ArrayProgrammmes;

import java.util.Scanner;

public class PositiveEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a=new int[10];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>0 && a[i]%2==0) {
			System.out.println(a[i]);
			}
		}
	}

}
