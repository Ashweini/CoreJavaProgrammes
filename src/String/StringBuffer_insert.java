package String;

public class StringBuffer_insert {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		
		//insert method
		s.insert(1, "java");
		System.out.println(s); //Hjavaello
		
		//delete method
		s.delete(1, 3);
		System.out.println(s);  //Hvaello
		
		//replace
		StringBuffer s2 = new StringBuffer("Hello");
		s2.replace(1, 3, "JAVA");
		System.out.println(s2);  //HJAVAlo
		
		//reverse
		System.out.println(s.reverse()); //olleavH
		
		//capacity()
		StringBuffer s6 = new StringBuffer();
		System.out.println(s6.capacity()); //default capacity 16
		s6.append("Hello");
		System.out.println(s6.capacity());
		s6.append("Good Eveningassssw");
		System.out.println(s6.capacity());  //default capacity 34
		
		//difference between length() v/s capacity()
		StringBuffer sb = new StringBuffer();
		sb.append("String object is there then th");
		int l = sb.length();  //length of the string
		int c = sb.capacity(); //capacity of the string 
		System.out.println("length of the string : "+l);  //9
		System.out.println("capacity of the string : "+c);//default capacity(16)
		
		//String object is there then adding capacity+string
		StringBuffer sb2 = new StringBuffer("String object is there then then then");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
	}

}
