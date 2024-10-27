package String;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Ashwini";
		String s2 = "STUDENT";
		
		//length()
		System.out.println(s1.length());
		
		//toString() method
		System.out.println(s1);
		System.out.println(s1.toString());
		
		//concate method
		System.out.println(s1+s2);
		
		//toUpperCase() method
		System.out.println(s1.toUpperCase());
		
		//toLowerCase
		System.out.println(s2.toLowerCase());
		
		//startswith() - return type of this method is boolean 
		System.out.println(s1.startsWith("a")); //false - starting with A not with a
		
		//endwith
		System.out.println(s1.endsWith("i"));//true - ends with i
		
		//replace
		System.out.println(s1.replace('i', 'S'));
		
		//replacefirst()
		System.out.println(s1.replaceFirst("i", "S"));
		
		//replaceAll
		System.out.println(s1.replaceAll("Ashwini", "Shrushti"));
		
		//isEmpty  --> returns boolean result
		String s3=" ";
		System.out.println(s3.isEmpty()); //false space(" ") is their
		
		//isBlank 
		//System.out.println(s1.isBlank());
		
		//charAt
		System.out.println(s1.charAt(5)); //character of that index
		
		//indexOf
		System.out.println(s1.indexOf('a'));  //if the particular character is not present is not present then -1
		
		//toCharArray()
		char[] ch = s1.toCharArray();
		System.out.println(ch);
		
		//subString()
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(0, 3));
		
		//split()
		String s4 = "Good Evening Everyone";
		String[] str = s4.split("e");
		for(int i=0; i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		
		

	}

}
