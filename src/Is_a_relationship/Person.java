package Is_a_relationship;

public class Person {
	
	static String SchoolName = "DRVP";
	String StudentName;
	int age;
	
//	Person(String StudentName, int age){
//		this.StudentName=StudentName;
//		this.age = age;
//	}
	
	public void Walk() {
		System.out.println(StudentName+" is walking");
	}
	
	public static void Walk1() {
		System.out.println(SchoolName+" is walking");
	}


}
