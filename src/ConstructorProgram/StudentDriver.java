package ConstructorProgram;

public class StudentDriver {

	public static void main(String[] args) {


		Student s1 = new Student();
		Student s2 = new Student(101);
		Student s3 = new Student(102, "Ashwini");
		Student s4 = new Student("Suri1", 104);
		Student s5 = new Student(103, "Suri", 90.65);
		
		System.out.println(s4.name+","+s4.rollno);
		System.out.println(s4.marks);

	}

}
