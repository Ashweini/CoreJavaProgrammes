package String;

public class StringObjectUsingnewKeyword {

	public static void main(String[] args) {


		String s1 = new String("hi");
		System.out.println(s1=="hi");  //false
		
		System.out.println(s1);  //hi
		System.out.println(s1.equals("hi"));  //true

	}

}
