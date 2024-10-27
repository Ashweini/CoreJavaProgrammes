package String;

public class StringtoCheckHashCode {

	public static void main(String[] args) {

		String s1=new String("ashwini");
		String s2 =  "ashwini";
		
		System.out.println(s1==s2);  //false
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		
		System.out.println("-------------------------------------");
		String s3=new String("ashwini");
		String s4=new String("ashwini");
		
		if(s3==s4) 
			System.out.println("welcome");
		else
			System.out.println("bye");
		
	}

}
