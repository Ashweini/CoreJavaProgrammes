package ClassCostException;

import java.util.ArrayList;
import java.util.Collections;

public class Student_Driver {

	public static void main(String[] args) {
		ArrayList students = new ArrayList();
		students.add(new Student(100));
		students.add(new Student(150));
		students.add(new Student(200));
		students.add(new Student(79));
		
		System.out.println(students); //[[Marks : 100], [Marks : 150], [Marks : 200], [Marks : 79]]
//I will get CCE here bcz their is no properties of comparator here due to that we get CCE 
		Collections.sort(students);
		
//		Collections.sort(students, new StudentComaparator());
		System.out.println(students); //[[Marks : 79], [Marks : 100], [Marks : 150], [Marks : 200]]
	}

}
