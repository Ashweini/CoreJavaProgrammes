package String;

public class StringBuffer_programs {

	public static void main(String[] args) {


		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("world");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		StringBuffer s = new StringBuffer("Hello");
		s.append(" Everyone");
		System.out.println(s);

	}

}
