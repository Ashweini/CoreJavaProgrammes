package String;

public class CountHowManyWordsInString {

	public static void main(String[] args) {

		String s1 = "Good evening evening";
		int c =0;
		String[] str = s1.split(" ");
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]+" ");
			c++;
		}
		System.out.println("Count of words : "+c);
	}

}
