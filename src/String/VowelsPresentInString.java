package String;

public class VowelsPresentInString {

	public static void main(String[] args) {
		String s1 = "Good evening evening";
		s1 = s1.toLowerCase();
		int c =0;
		for(int i=0; i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
				c++;
			}
		}
		System.out.println("count of Vowels : "+c);

	}

}
