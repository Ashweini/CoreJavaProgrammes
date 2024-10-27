package SuperCallStatement;
//we can create a constructor non static memnber of parent and child by using inheritance 
public class StudentDriver {

	public static void main(String[] args) {


		Student s1 = new Student(123, "Ashwini");
		
		System.out.println(s1.name);
		System.out.println(s1.stdId);

	}

}
