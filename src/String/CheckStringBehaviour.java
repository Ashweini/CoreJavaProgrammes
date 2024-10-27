package String;

public class CheckStringBehaviour {

	public static void main(String[] args) {


		String s1 = "hello";
		String s2 = "hi";
		
		System.out.println(s1==s2);   //false
		//System.out.println(s1.equals(s2));
		
		System.out.println(s1=="hi");   //false
		
		String s3 = s2;
		System.out.println(s3==s2);    //true
		
		s1 = s2;
		System.out.println(s1==s2);  //true

	}

}
