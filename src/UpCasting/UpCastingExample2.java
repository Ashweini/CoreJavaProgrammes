package UpCasting;

public class UpCastingExample2 {

	public static void main(String[] args) {

		EngStudent e1 = new EngStudent();
		
		//Upcasting
		Student s1 = new EngStudent();
		Person p1 = new Student();
		
		//Object is an supermost class in Java hirarchy
		Object o1 = new Person();
		Object o2 = new EngStudent();

	}

}
