package String;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {

		String str = "hello";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//converting stringBuffer to StringBuilde
		StringBuilder s1 = new StringBuilder(str);
		s1.append(" Everyone");
		System.out.println(s1);
		
		//insert method
		System.out.println("-----------inset------------");
				sb.insert(1, "java");
				System.out.println(sb); //Hjavaello
				
				//delete method
				System.out.println("-----------delete------------");
				sb.delete(1, 3);
				System.out.println(sb);  //Hvaello
				
				//replace
				System.out.println("---------replace---------");
				StringBuilder s2 = new StringBuilder("Hello");
				s2.replace(1, 3, "JAVA");
				System.out.println(s2);  //HJAVAlo
				
				//reverse
				System.out.println("-------reverse--------------");
				System.out.println(sb.reverse()); //olleavH
				
				//capacity()s
				StringBuilder s6 = new StringBuilder();
				System.out.println(s6.capacity()); //default capacity 16
				s6.append("Hello");
				System.out.println(s6.capacity());
				s6.append("Good Eveningassssw");
				System.out.println(s6.capacity());  //default capacity 34
				
				//difference between length() v/s capacity()
				StringBuilder sb1 = new StringBuilder();
				sb.append("String object is there then th");
				int l = sb1.length();  //length of the string
				int c = sb1.capacity(); //capacity of the string 
				System.out.println("length of the string : "+l);  //9
				System.out.println("capacity of the string : "+c);//default capacity(16)
				
				//String object is there then adding capacity+string
				StringBuilder sb2 = new StringBuilder("String object is there then then then");
				System.out.println(sb2.length());
				System.out.println(sb2.capacity());


	}

}
