package ContructorChaining;

import ConstructorProgram.Student;

public class StudentDriver {
	
	public static void main(String[] args) {
		
	
	
	Student1 s1 = new Student1();
	Student1 s2 = new Student1(101);
	Student1 s3 = new Student1(102, "Ashwini");
	Student1 s4 = new Student1("Suri1", 104);
	Student1 s5 = new Student1(103, "Suri", 90.65);
	
	System.out.println(s4.name+","+s4.rollno);
	System.out.println(s4.marks);

	}
}
