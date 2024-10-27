package ArrayProgrammmes;
import java.util.Scanner;
public class OddEVenNumSum {
	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int OddSum=0;
		int EvenSum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				EvenSum = EvenSum+a[i];
			}
			else {
				OddSum = OddSum+a[i];
			}
		}
			System.out.println(EvenSum);	
		    System.out.println(OddSum);
		    
		    //Using Cobditional statement 
		   /* int res = EvenSum>OddSum? EvenSum-OddSum: OddSum-EvenSum;
		    System.out.println(res);*/
		    
		    //Using if statement
		    if(EvenSum>OddSum) {
		    	System.out.println(EvenSum-OddSum);
		    }
		    else {
		    	System.out.println(OddSum-EvenSum);
		    }
		    	
	}

}
