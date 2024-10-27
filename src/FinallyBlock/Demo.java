package FinallyBlock;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Main Start");
		try {
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException e){
			//This method will give detailed information about exception
			e.printStackTrace();
		}finally {
			System.out.println("Hii");
		}
		System.out.println("Main End");
	}

}
