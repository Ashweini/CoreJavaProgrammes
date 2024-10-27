package ArrayProgrammmes;

import java.util.Scanner;

public class DynamicInitializationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[4];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array element");
		/*a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		a[3]=sc.nextInt();*/
		
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
