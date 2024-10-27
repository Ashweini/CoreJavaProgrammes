package WrapperClasses;

public class Demo {
	public static void main(String[] args) {
		int a = 10;
		
		//AutoBoxing
		Integer b = a;  //prmitive converting into non primitive
		System.out.println(a);
		System.out.println(b.toString());//it's a Object//toString will returns the states of the Object
		
		byte b1 = 23;
		Byte b2 = b1;
		System.out.println(b1);
		System.out.println(b2);
		
		boolean t1 = true;
		Boolean t2 = t1;
		System.out.println(t2);  //true is a Object
		
		char c = 'a';
		Character c1 = c;
		System.out.println(c1);
	}

}
