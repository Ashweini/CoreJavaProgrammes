package ArrayProgrammmes;

public class ArrayLength {

	public static void main(String[] args) {
		
		int[] a= {10, 20, 30, 40, 50};
		System.out.println(a.length);
		
		//fetch the data
		System.out.println(a[0]);
		
		int[] b= new int[5];
		//storing data
		b[0]=77;
		b[1]=78;
		b[2]=79;
		b[3]=80;
		
		//fetching data
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		System.out.println(b.length);
		
	}

}
