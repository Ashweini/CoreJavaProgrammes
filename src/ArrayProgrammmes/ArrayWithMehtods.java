package ArrayProgrammmes;

public class ArrayWithMehtods {

	public static void main(String[] args) {


		int[] a= {10, 20, 30,40, 50};
		
		int[] b= {-10, -4, 5, 6};
		
		printElements(a);
		
		System.out.println("========================================");
		
		printElements(b);

	}
	
	public static void printElements(int[] c) {
	for(int i=c.length-1;i>=0;i--) {
		System.out.println(c[i]);
	}
	
	
//	public static void printElements(int[] a) {
//	for(int i=0; i<a.length; i++) {
//		System.out.println(a[i]);
//	}
	
	}

}
