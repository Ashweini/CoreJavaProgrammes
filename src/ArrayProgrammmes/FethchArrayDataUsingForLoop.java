package ArrayProgrammmes;

public class FethchArrayDataUsingForLoop {
	
	public static void main(String[] args) {
		
		int[] b= new int[5];
		//storing data
		b[0]=77;
		b[1]=78;
		b[2]=79;
		b[3]=80;
		b[4]=81;
		
		for(int i=0; i<=b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
