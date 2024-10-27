package Is_a_relationship;

public class InhertedExampleDriver {

	public static void main(String[] args) {

		//use static variable and method with the help of subclass name
		System.out.println(subClass.i);
		subClass.testName();
		
		//try to access static members of parent class with the help of subclass object reference 
		subClass s1 = new subClass();
		
		//parent class static variable 
		System.out.println(s1.i);
		s1.testName();
		

	}

}
