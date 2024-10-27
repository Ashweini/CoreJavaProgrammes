package String;

public class StringImmutableInNature {

	public static void main(String[] args) {


			String s1 = "Hi";
			String s2 = "Hello";
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			
			
			s1 = s1+"Everyone";
			s2 = s2+s1+"Everyone";
			System.out.println(s1.hashCode()+"->"+s1);
			System.out.println(s2.hashCode()+"->"+s2);
			

	}

}
