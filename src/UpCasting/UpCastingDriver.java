package UpCasting;

public class UpCastingDriver {

	public static void main(String[] args) {


		Person p1=(Person)new Student("ashwini", 124);
		System.out.println(p1.name);
		//System.out.println(p1.stdid); - not able to access
		
		Person p2=(Person)new EngStudent("E&C", "ashwini1",124);
		System.out.println(p2.name);
	/*	System.out.println(p2.stdid);
		System.out.println(p2.stream); */ // CTE - not able to access child class members 
	

	}

}
