package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionProgram_1 {

	public static void main(String[] args) {


		//System.out.println(10/0); //CTS bcz sysntactically correct
		//runtime getting exception as ArithmeticException
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the first number");
//		int n1 =s.nextInt();
//		System.out.println("Enter the 2nd number");
//		int n2 = s.nextInt();
		
//		System.out.println(n1/n2);
		
		//NullPointerException - container contain a null value if you are trying to perform some action we get this exception
//		String str = null;
//		System.out.println(str.length()); //java.lang.NullPointerException - on null trying to find length 
//		System.out.println(str.toUpperCase());//java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "str" is null
		
		
		//NumberFormateException - Wrapper classes we can convert by using parse class string to int
//		String str1 = "abc123";
//		int num = Integer.parseInt(str1);
//		System.out.println(num);//java.lang.NumberFormatException: For input string: "abc123"
		
		//IndexOutOfBoundException
		//4.1. ArrayIndexOutOfBoundException
//		int[] a = new int[4];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=50;
////size 4 but I am trying to store 5 elements so getting - ArrayIndexOutOfBoundsException
//		a[4]=60; // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4 		
//		for(int i=0;i<=a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		
		//4.2. StringIndexOutOfBoundException
		String str = "shraddha";
		System.out.println(str.length());
//string length is just 8(0 to 7) trying to print 9th data so getting -StringIndexOutOfBoundsException
		System.out.println(str.charAt(8));//java.lang.StringIndexOutOfBoundsException: String index out of range: 8
		
		//InputOutputException
//		FileReader fr = new FileReader("xyz.txt"); //FileNotFoundException - Compiler know you will get this exception that's why it's showing earlier onl
		
		
		
		
		
	

	}

}
