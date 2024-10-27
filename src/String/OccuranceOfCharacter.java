package String;

public class OccuranceOfCharacter {

	public static void main(String[] args) {

		String a = "Sharaddha";
		int c = 0;
		for(int i=0; i<a.length();i++) {
			char ch = a.charAt(i);			
			if(ch=='a') {
				c++;
			}
		}
		System.out.println("occurance of character : " +c );

	}

}
