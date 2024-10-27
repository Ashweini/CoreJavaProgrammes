package DownCasting;

public class MainAppDriver {

	public static void main(String[] args) {

		//UpCasting
		Person p = new Student("Ashwini", 123);
		System.out.println(p.name);
		//System.out.println(p.Sid); //Sid we can't access Upcated child we can't access
		
		Student s= (Student)p;  
		//DownCasting using
		//to display Sid - DownCasting Using variable
		System.out.println(s.Sid);
		System.out.println(s.name);

		//downCasting and accessing without extra variable
		System.out.println(((Student)p).Sid);
	}

}
