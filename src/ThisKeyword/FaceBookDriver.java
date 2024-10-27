package ThisKeyword;

public class FaceBookDriver {

	public static void main(String[] args) {

		FaceBookUser fb = new FaceBookUser("xyz@gmail.com", "xyz", "xyz@123");
		
		System.out.println(fb.emailID);
		System.out.println(fb.name);
		System.out.println(fb.pwd);

	}

}
