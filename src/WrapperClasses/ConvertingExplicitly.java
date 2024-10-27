package WrapperClasses;

public class ConvertingExplicitly {

	public static void main(String[] args) {
		//converting Integer to int
		
//		Integer a = new Integer(10);//not in use
//		
//		int i = a.intValue();//intvalue convering object into the integer value-Converting Explicitly
//		System.out.println(i);
//		
//		int j = a; //AutoUnboxing
//		System.out.println(j);
		
		int a = 10;
		Integer i = a;
		
		byte b1 = i.byteValue();
		short s1 = i.shortValue();
		int i1 = i.intValue();
		long l1 = i.longValue();
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		
		

	}

}
